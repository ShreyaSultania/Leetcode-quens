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
    boolean helper(TreeNode root,int sum,int target){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            sum+=root.val;
            if(sum!=target) return false;
            else return true;
        }
        sum+=root.val;
       return helper(root.left,sum,target) || helper(root.right,sum,target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return helper(root,0,targetSum);
    }
}