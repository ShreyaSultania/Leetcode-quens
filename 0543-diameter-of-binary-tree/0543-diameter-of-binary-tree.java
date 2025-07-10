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
    // find level
    int level(TreeNode root){
        if(root==null) return 0;
        int left=1+level(root.left);
        int right=1+level(root.right);
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int diameter=level(root.left)+level(root.right);
        
         int leftdia=diameterOfBinaryTree(root.left);
         int rightdia=diameterOfBinaryTree(root.right);
         return Math.max(diameter,Math.max(leftdia,rightdia));

    }
}