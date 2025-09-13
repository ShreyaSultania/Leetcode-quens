class Solution {
    long helper(int nums[],int x,int i,int parity,long dp[][]){
        if(nums.length==i) return 0;
        if(dp[i][parity]!=-1) return dp[i][parity];
        long skip=helper(nums,x,i+1,parity,dp);
        // if(nums[i]%2!=parity) return skip;
        long take=0;
        if(nums[i]%2==parity){
            take = nums[i]+helper(nums,x,i+1,parity,dp);
        }
        else{
            take = nums[i]-x+helper(nums,x,i+1,parity==0?1:0,dp);
        }
        return dp[i][parity]=Math.max(skip,take);
    }
    public long maxScore(int[] nums, int x) {
        long [][]dp=new long[nums.length][2];
        for(long row[]:dp){
           Arrays.fill(row,-1);
        }
        int parity=(nums[0]%2==0)?0:1;
        return helper(nums,x,0,parity,dp);
    }
}