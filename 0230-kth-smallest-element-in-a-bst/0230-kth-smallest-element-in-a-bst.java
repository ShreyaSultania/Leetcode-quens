
class Solution {
    void helper(ArrayList<Integer>arr,TreeNode root){
        if(root==null) return;
        helper(arr,root.left);
        arr.add(root.val);
        helper(arr,root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
ArrayList<Integer>arr=new ArrayList<>();
         helper(arr,root);
         return arr.get(k-1);
    }
}