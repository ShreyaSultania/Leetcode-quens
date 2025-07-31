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
    TreeNode helper(int[] preorder, int[] inorder,int pl,int ph,int il,int ih){
        if(pl>ph || il>ih) return null;
        TreeNode root=new TreeNode(preorder[pl]);
        int r=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[pl]){
                 r=i;
                 break;
            }
        }
        int ls=r-il;
        root.left=helper(preorder,inorder,pl+1,pl+ls,il,r-1);
        root.right=helper(preorder,inorder,pl+1+ls,ph,r+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         return helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
}