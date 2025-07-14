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
class Solution {
    int min=Integer.MAX_VALUE;
    int helper(TreeNode root,int c){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            min=Math.min(c,min);
        }
        helper(root.left,c+1);
        helper(root.right,c+1);
       return min;
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        return helper(root,1);
    }
}