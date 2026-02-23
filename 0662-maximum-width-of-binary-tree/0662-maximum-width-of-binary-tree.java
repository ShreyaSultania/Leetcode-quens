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
   int helper(TreeNode root){
       if(root==null) return 0;
       Queue<Pair>q=new LinkedList<>();
       int width=0;
       q.add(new Pair(root,0));
       while(q.size()>0){
        int size=q.size();
        int firstidx=-1;
        int lastidx=-1;
        for(int i=0;i<size;i++){
            Pair p=q.remove();
            if(i==0) firstidx=p.idx;
            if(i==size-1)lastidx=p.idx;
            if(p.node.left!=null){
                q.add(new Pair(p.node.left,2*(p.idx)+1));
            }
            if(p.node.right!=null){
                 q.add(new Pair(p.node.right,2*(p.idx)+2));
            }
        }
        width=Math.max(width,lastidx-firstidx+1);
       }
       return width;
   }
    public int widthOfBinaryTree(TreeNode root) {
       return helper(root);
    }
}