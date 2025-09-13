class Solution {
    static int sum=0;
    int helper(int nums[],int target,int idx,int [][]dp,int res){
        if(idx==nums.length){
            if(target==res) return 1;
            else return 0;
        }
        if(dp[idx][res+sum]!=-1) return dp[idx][res+sum];
        int add=helper(nums,target,idx+1,dp,res+nums[idx]);
        int sub=helper(nums,target,idx+1,dp,res-nums[idx]);
        return dp[idx][res+sum]=add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
         sum=0;
        for(int ele:nums){
            sum+=ele;
        }
     int dp[][]=new int[nums.length][2*sum+1];
     for(int[]row:dp){
        Arrays.fill(row,-1);
     }
     return helper(nums,target,0,dp,0);
    }
}