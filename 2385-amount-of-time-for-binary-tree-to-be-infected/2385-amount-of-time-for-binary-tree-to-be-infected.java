/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode node,int idx){
        this.node=node;
        this.idx=idx;
    }
 }
class Solution {
     HashMap<TreeNode,TreeNode>map;
      TreeNode targetNode;
      int target;
     void dfs(TreeNode root){
        if(root==null) return;
        if(root.val==target){
            targetNode=root;
        }
        if(root.left!=null){
            map.put(root.left,root);
        }
        if(root.right!=null){
            map.put(root.right,root);
        }
        dfs(root.left);
        dfs(root.right);
     }
    public int amountOfTime(TreeNode root, int start) {
       target=start;
       targetNode=null;
       map=new HashMap<>(); //child,parent
        //put the element in map 
       dfs(root);
       HashSet<TreeNode>visited=new HashSet<>();
       Queue<Pair>q=new LinkedList<>();
       int max=0;
       q.add(new Pair(targetNode,0));
       visited.add(targetNode);
       while(q.size()>0){
        Pair p=q.remove();
        max=Math.max(max,p.idx);
        if(map.containsKey(p.node) && !visited.contains(map.get(p.node))){  
            q.add(new Pair(map.get(p.node),p.idx+1));
            visited.add(map.get(p.node));
        }
        if(p.node.left!=null && !visited.contains(p.node.left)){
            q.add(new Pair(p.node.left,p.idx+1));
             visited.add(p.node.left);
        }
         if(p.node.right!=null && !visited.contains(p.node.right)){
            q.add(new Pair(p.node.right,p.idx+1));
             visited.add(p.node.right);
        }
       }
    return max;
    }
}