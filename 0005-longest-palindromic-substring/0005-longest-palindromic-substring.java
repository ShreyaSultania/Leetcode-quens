class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
       int [][]dp=new int[n][n];
       int max=Integer.MIN_VALUE;
       int start=-1;
       int end=-1;
       for(int k=0;k<n;k++){
        int i=0;
        int j=k;
        while(j<n){
            if(i==j){
                dp[i][j]=1;
                max=Math.max(max,dp[i][j]);
                start=i;
                end=j;
            }
            else if(i+1==j){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=2;
                    max=Math.max(max,dp[i][j]);
                    start=i;
                    end=j;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j)){
                    if(dp[i+1][j-1]>0){
                        dp[i][j]=1+dp[i+1][j-1];
                        max=Math.max(max,dp[i][j]);
                        start=i;
                        end=j;
                    }
                }
            }
            i++;
            j++;
        }
       }
       System.out.print(max+" "+start+" "+end);
       return s.substring(start,end+1);
    }
}