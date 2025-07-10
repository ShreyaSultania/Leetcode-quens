class Solution {
    public List<List<Integer>>zigzagLevelOrder(TreeNode root) {
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
        for(int i=0;i<ans.size();i++){
            if(i%2!=0){
                List<Integer>t=ans.get(i);
                int k=0;
                int j=t.size()-1;
                while(k<=j){
                    int temp=t.get(k);
                    t.set(k,t.get(j));
                    t.set(j,temp);
                    k++;
                    j--;
                }
            }
        }
        return ans;
    }
}