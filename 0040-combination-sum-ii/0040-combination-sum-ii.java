class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    void helper(int []nums,int idx,int target,List<Integer>temp,int sum){
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(idx==nums.length || sum>target) return;
        int i=idx;
        while(i+1<nums.length && nums[i]==nums[i+1]) i++;
        helper(nums,i+1,target,temp,sum);  //skip
        temp.add(nums[idx]);
        helper(nums,idx+1,target,temp,sum+nums[idx]);//take
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,0,target,temp,0);
        return ans;
    }
}