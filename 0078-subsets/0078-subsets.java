class Solution {
    void helper(int[] nums, List<List<Integer>>ans,List<Integer>temp,int idx){
        if(nums.length==idx){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // skip
        helper(nums,ans,temp,idx+1);
        // take
        temp.add(nums[idx]);
        helper(nums,ans,temp,idx+1);
        // backtracking
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(nums,ans,temp,0);
        return ans;
    }
}