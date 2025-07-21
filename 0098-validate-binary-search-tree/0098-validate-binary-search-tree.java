
class Solution {
    long Max(TreeNode root){
      if(root==null) return Long.MIN_VALUE;
      return Math.max(root.val,Math.max(Max(root.left),Max(root.right)));
    }
       long Min(TreeNode root){
      if(root==null) return Long.MAX_VALUE;
      return Math.min(root.val,Math.min(Min(root.left),Min(root.right)));
       }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.val<=Max(root.left)) return false;
        if(root.val>=Min(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}