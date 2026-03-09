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
    int max=0;
    int level(TreeNode root){
        if(root==null) return 0;
        int left=1+level(root.left);
        int right=1+level(root.right);
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
       int left=level(root.left);
       int right=level(root.right);
       int diameter=left+right;
       max=Math.max(diameter,max);
        diameterOfBinaryTree(root.left);
         diameterOfBinaryTree(root.right);
         return max;
    }
}