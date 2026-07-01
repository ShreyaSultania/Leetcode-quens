class Solution {
    void helper(int i,List<List<Integer>>ans,List<Integer>temp,int []nums,int n){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //skip
        helper(i+1,ans,temp,nums,n);
        //take
        temp.add(nums[i]);
        helper(i+1,ans,temp,nums,n);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int n=nums.length;
        helper(0,ans,temp,nums,n);
        return ans;
    }
}