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
    void helper(List<List<Integer>>ans,List<Integer>temp,TreeNode root,int target,int sum){
        if(root==null) return;
        temp.add(root.val);
        sum+=root.val;
         if(root.left==null && root.right==null){
            if(sum==target){
                ans.add(new ArrayList<>(temp));
            }
        }
        helper(ans,temp,root.left,target,sum);
        helper(ans,temp,root.right,target,sum);
       temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(ans,temp,root,targetSum,0);
        return ans;
    }
}