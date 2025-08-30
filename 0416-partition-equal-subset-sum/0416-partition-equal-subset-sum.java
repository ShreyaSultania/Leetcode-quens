class Solution {
    boolean ans(int []nums,int target,int idx,int dp[][]){
        if(idx==nums.length){
            if(target==0) return true;
            return false;
        }
        if(dp[idx][target]!=-1) return dp[idx][target]==1;
        boolean ans=false;
        boolean skip=ans(nums,target,idx+1,dp);
        if(target-nums[idx]<0) ans=skip;
        else {
        boolean take=ans(nums,target-nums[idx],idx+1,dp);
        ans= skip||take;
        }
        dp[idx][target]=(ans) ? 1:0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        int dp[][]=new int[nums.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return ans(nums,target,0,dp);
    }
}
