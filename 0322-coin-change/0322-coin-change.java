class Solution {
    
    long profit(int[] coins,int target,int idx,long[][]dp){
        if(idx==coins.length){
            if(target==0) return 0;
            else return Integer.MAX_VALUE;
            
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        long skip=profit(coins,target,idx+1,dp);
        if(target-coins[idx]<0) return dp[idx][target]=skip;
        long take=1+profit(coins,target-coins[idx],idx,dp);
        return dp[idx][target]=Math.min(skip,take);
    }
    public int coinChange(int[] coins, int amount) {
        long dp[][]=new long[coins.length][amount+1];
        for(long row[]:dp){
            Arrays.fill(row,-1);
        }
        int ans=(int)profit(coins,amount,0,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}