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
    void helper(TreeNode root,ArrayList<Integer>arr){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
        }
        helper(root.left,arr);
        helper(root.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>arr1=new ArrayList<>();
        helper(root1,arr1);
         ArrayList<Integer>arr2=new ArrayList<>();
          helper(root2,arr2);
          int size1=arr1.size();
          int size2=arr2.size();
          if(size1!=size2) return false;
          for(int i=0;i<size1;i++){
            if(arr1.get(i)!=arr2.get(i)) return false;
          }
          return true;
    }
}