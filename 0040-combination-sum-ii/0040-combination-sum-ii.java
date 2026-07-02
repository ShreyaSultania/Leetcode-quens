class Solution {
    void helper( List<List<Integer>>ans, List<Integer>temp,int []nums,int target,int i){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        } 
        if(i==nums.length) return;
        //take
        if(target>=nums[i]){
        temp.add(nums[i]);
        helper(ans,temp,nums,target-nums[i],i+1);
        temp.remove(temp.size()-1);
        while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        }
        //skip
        helper(ans,temp,nums,target,i+1);

    }
    public List<List<Integer>> combinationSum2(int[]nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(ans,temp,nums,target,0);
        return ans;
    }
}