
class Solution {
    int c=0;
    void helper(TreeNode root,long targetSum){
        if(root==null) return;
        targetSum=targetSum-root.val;
         if(targetSum==0)c++;

        helper(root.left,targetSum);
        helper(root.right,targetSum);                        
    }
    public int pathSum(TreeNode root, long targetSum) {
        if(root==null) return 0;
        helper(root,targetSum);  
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return c;
    }
}