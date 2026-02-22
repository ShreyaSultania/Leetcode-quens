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
class Triplet implements Comparable<Triplet>{
    TreeNode Node;
    int idx;
    int level;
    Triplet(TreeNode Node,int idx,int level){
        this.Node=Node;
        this.idx=idx;
        this.level=level;
    }
    public int compareTo(Triplet t){
        if(t.idx!=this.idx) return Integer.compare(this.idx,t.idx);
         if(t.level!=this.level) return Integer.compare(this.level,t.level);
         else return Integer.compare(this.Node.val,t.Node.val);
    }
 }
class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    PriorityQueue<Triplet>pq=new PriorityQueue<>();
    void helper(TreeNode root){
        if(root==null) return;
        Queue<Triplet>q=new LinkedList<>();
        q.add(new Triplet(root,0,0));
        while(q.size()>0){
        int size=q.size();
          for(int i=0;i<size;i++){
            Triplet t=q.remove();
            pq.add(t);
            if(t.Node.left!=null) q.add(new Triplet(t.Node.left,t.idx-1,t.level+1));
            if(t.Node.right!=null) q.add(new Triplet(t.Node.right,t.idx+1,t.level+1));
        }
    }
    while(pq.size()>0){
        List<Integer> list = new ArrayList<>();
        int minIdx = pq.peek().idx;
        while(pq.size()>0 && pq.peek().idx==minIdx){
            Triplet t=pq.remove();
            list.add(t.Node.val);
        }
        ans.add(list);

    }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        helper(root);
        return ans;
    }
}