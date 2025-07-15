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
    
    int levels(TreeNode root){
        if(root==null) return 0;
        int c=1+levels(root.left);
        int c1=1+levels(root.right);
        return Math.max(c,c1);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff= Math.abs((levels(root.right))-(levels(root.left))); 
        if(diff>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}