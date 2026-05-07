class Solution {
    boolean helper(int []nums,int idx,int []dp){
        if(nums.length-1<idx) {
            return false;
        }
        if(nums.length-1==idx){
            return true;
        }
        if(dp[idx]!=-1) return dp[idx]==1;
        boolean ans=false;
        for(int i=0;i<nums[idx];i++){
            if(helper(nums,i+1+idx,dp)){
                ans=true;
                return ans;
        }
        }
        if(ans) dp[idx]=1;
        else dp[idx]=0;
        return ans;
    }

    public boolean canJump(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return helper(nums,0,dp);
    }
}