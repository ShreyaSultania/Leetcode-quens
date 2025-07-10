

class Solution {
    public List<List<Integer>>levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return ans;
         q.add(root);
        while(!q.isEmpty()){
             int n=q.size();
             ArrayList<Integer>temp=new ArrayList<>();
             for(int i=0;i<n;i++){
            TreeNode curr=q.poll();
            temp.add(curr.val);
           if(curr.left!=null) q.add(curr.left);
             if(curr.right!=null)q.add(curr.right);
        }
        ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;
    }
}