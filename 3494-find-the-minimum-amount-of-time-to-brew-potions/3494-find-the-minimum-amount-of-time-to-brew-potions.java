class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n=skill.length;
        int m=mana.length;
        long []dp=new long[n];
        for(int i=0;i<m;i++){
            dp[0]+=skill[0]*mana[i];
            for(int j=1;j<n;j++){
                dp[j]=Math.max(dp[j],dp[j-1])+skill[j]*mana[i];
            }
            for(int k=n-1;k>0;k--){
                dp[k-1]=dp[k]-(skill[k]*mana[i]);
            }
        }
        return dp[n-1];
    }

}