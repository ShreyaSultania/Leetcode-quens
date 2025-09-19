class Solution {
    int helper(int i,int j,String s, String t,int dp[][]){
        if(i<0 ||j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]=1+helper(i-1,j-1,s,t,dp);
        else return dp[i][j]=Math.max(helper(i-1,j,s,t,dp),helper(i,j-1,s,t,dp));
    }
    public int minDistance(String s, String t) {
        int m=s.length();
        int n=t.length();
        int dp[][]=new int[m][n];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return m+n-2*helper(m-1,n-1,s,t,dp);
    }
}