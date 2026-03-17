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
    TreeNode data;
    int idx;
    int level;
    Triplet( TreeNode data,int idx, int level){
        this.data=data;
        this.idx=idx;
        this.level=level;
    }
    public int compareTo(Triplet t){
        if(t.idx!=this.idx) return this.idx-t.idx;
       else if(t.level!=this.level) return this.level-t.level;
        else return this.data.val-t.data.val;
    }
 }
class Solution {
    List<List<Integer>>ans;
    void bfs(TreeNode root){
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        Queue<Triplet>q=new LinkedList<>();
        q.add(new Triplet(root,0,0));
        while(q.size()>0){
            Triplet t=q.remove();
            pq.add(t);
            if(t.data.left!=null){
                q.add(new Triplet(t.data.left,t.idx-1,t.level+1));
            }
            if(t.data.right!=null){
                q.add(new Triplet(t.data.right,t.idx+1,t.level+1));
            }
        }
        while(pq.size()>0){
            ArrayList<Integer>temp=new ArrayList<>();
            int index=pq.peek().idx;
            while(pq.size()>0 && pq.peek().idx==index){
                Triplet t=pq.remove();
                temp.add(t.data.val);
            }
            ans.add(temp);
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        ans=new ArrayList<>();
        bfs(root);
        return ans;
    }
}