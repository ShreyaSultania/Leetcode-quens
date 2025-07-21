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
    void helper(TreeNode root,ArrayList<TreeNode>ans){
        if(root==null) return;
        helper(root.left,ans);
        ans.add(root);
        helper(root.right,ans);
    }
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<TreeNode>arr=new ArrayList<>();
        helper(root,arr);
        for(int i=arr.size()-2;i>=0;i--){
           arr.get(i).val+=arr.get(i+1).val;
            
        }
        return root;
        
    }
}