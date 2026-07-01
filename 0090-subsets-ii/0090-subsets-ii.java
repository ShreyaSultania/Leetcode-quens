class Solution {
    void helper(int i,List<List<Integer>>ans,List<Integer>temp,int []nums,int n){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //take

        temp.add(nums[i]);
        helper(i+1,ans,temp,nums,n);
        temp.remove(temp.size()-1);
        while( i<n-1 && nums[i]==nums[i+1]) i++;
        //skip
        helper(i+1,ans,temp,nums,n);
        
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(0,ans,temp,nums,n);
        return ans;
    }
}