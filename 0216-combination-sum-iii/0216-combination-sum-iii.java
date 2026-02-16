class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    void helper(int k,int target,List<Integer>temp,int idx,int sum){
        if(temp.size()==k){
            if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
            }
        }
        if(sum>target || idx>9 || temp.size()>k) return;
        helper(k,target,temp,idx+1,sum);//skip
        temp.add(idx);
        helper(k,target,temp,idx+1,sum+idx);//take
        temp.remove(temp.size()-1); //backtrack
    }
    public List<List<Integer>> combinationSum3(int k, int target) {
        List<Integer>temp=new ArrayList<>();
        helper(k,target,temp,1,0);
        return ans;

    }
}