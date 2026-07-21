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
    void helper(TreeNode root,String s,ArrayList<String>temp){
        if(root==null) return;
        s+=root.val;
        if(root.left==null && root.right==null){
            temp.add(s);
            return;
        }
        helper(root.left,s,temp);
        helper(root.right,s,temp);
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<String>temp=new ArrayList<>();
        helper(root,"",temp);
        int ans=0;
        for(int i=0;i<temp.size();i++){
            int val=Integer.valueOf(temp.get(i));
            ans+=val;
        }
        return ans;
    }
}