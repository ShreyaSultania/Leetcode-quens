class Solution {
    int cost(int i,int j,int[] arr,int[][]dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min_cost=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int len=(arr[j+1]-arr[i-1]);
            int totalCost=cost(i,k-1,arr,dp)+cost(k+1,j,arr,dp)+len;
            min_cost=Math.min(min_cost,totalCost);
        }
      return dp[i][j]=min_cost;
    }
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int cut[]=new int[cuts.length+2];
        cut[0]=0;
        for(int i=1;i<cut.length-1;i++){
            cut[i]=cuts[i-1];
        }
        cut[cuts.length+1]=n;
        int m=cut.length;
        int dp[][]=new int[m-1][m-1];
        for(int []arr:dp){
            Arrays.fill(arr,-1);
        }
       return cost(1,cut.length-2,cut,dp);

    }
}