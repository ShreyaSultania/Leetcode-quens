
class Solution {
    void helper(TreeNode root, int target,List<Integer>temp,List<List<Integer>>res){
        if(root==null) return;
         target=target-root.val;
         temp.add(root.val);
         if(root.left==null && root.right==null && target==0){
            res.add(new ArrayList<>(temp));
         }
          helper(root.left,target,temp,res);
           helper(root.right,target,temp,res);
           temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
     List<Integer>temp=new ArrayList<>();
     List<List<Integer>>res=new ArrayList<>();
     if(root==null) return res;
     helper(root,target,temp,res);
     return res;
    }
}