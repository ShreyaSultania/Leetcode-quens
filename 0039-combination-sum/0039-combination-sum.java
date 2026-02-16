class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    void helper(int []nums,int target,List<Integer>temp,int idx,int sum){
        if(idx==nums.length || sum>target) return;
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        helper(nums,target,temp,idx+1,sum); //skip
        temp.add(nums[idx]);
        helper(nums,target,temp,idx,sum+nums[idx]); //single add
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<Integer>temp=new ArrayList<>();
        
        helper(candidates,target,temp,0,0);
        return ans;
    }
}