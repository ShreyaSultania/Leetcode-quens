class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
       
        int res=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            int j=i-1;
             int max=0;
            while(j>=0){
                if(nums[i]>nums[j]){
                    max=Math.max(max,dp[j]);
                    dp[i]=1+max;
                }
                j--;
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}