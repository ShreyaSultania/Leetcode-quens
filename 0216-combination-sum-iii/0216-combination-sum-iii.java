class Solution {
    void helper(int k,int target,List<List<Integer>>ans,List<Integer>temp,int i,int sum){
        if(target==0 && temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size()>k || target<0 || i>9) return;
        //take
        if(target>=i){
        temp.add(i);
        helper(k,target-i,ans,temp,i+1,sum);
        temp.remove(temp.size()-1);
        }
        //skip
        helper(k,target,ans,temp,i+1,sum);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>>ans=new ArrayList<>();
         List<Integer>temp=new ArrayList<>();
         helper(k,n,ans,temp,1,0);
         return ans;
    }
}