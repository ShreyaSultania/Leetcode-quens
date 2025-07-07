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
    void helper(ArrayList<Integer>ans,TreeNode root){
        if(root==null) return;
        ans.add(root.val);
        helper(ans,root.left); helper(ans,root.right);
    }
    public int countNodes(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        helper(ans,root);
        return ans.size();
    }
}