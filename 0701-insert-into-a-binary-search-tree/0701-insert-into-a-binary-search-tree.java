
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode NewNode=new TreeNode(val);
        // if(root.left==null && root.right==null) return root;
        if(root==null) return NewNode;
       if(root.val>val){
            root.left= insertIntoBST(root.left,val);
        }
        else{
          root.right= insertIntoBST(root.right,val);
        }
        return root;
    }
}