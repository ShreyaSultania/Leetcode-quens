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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int k=0;
        while(q.size()>0){
            int size=q.size();
            List<Integer>temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode ele=q.remove();
                temp.add(ele.val);
                if(ele.left!=null) q.add(ele.left);
                if(ele.right!=null) q.add(ele.right);
            }
            if(k%2!=0){
                Collections.reverse(temp);
                ans.add(temp);
            }
            else ans.add(temp);
            k++;
        }
        return ans;
    }
}