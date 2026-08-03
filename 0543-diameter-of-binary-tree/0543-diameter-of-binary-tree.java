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
    int maxD=0;
    int level(TreeNode root){
        if(root==null) return 0;
        int left=1+level(root.left);
        int right=1+level(root.right);
        // maxD=left+right;
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int l=level(root.left);
        int r=level(root.right);
        
        maxD=Math.max(maxD,l+r);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return maxD;
    }
}