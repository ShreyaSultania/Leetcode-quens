class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        if(n<3) return 0;
        int idx=-1;
        int max=0;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        int res=0;
        for(int i=0;i<=idx;i++){
            dp[i]=1;
            int j=i-1;
            int maxx=0;
            while(j>=0){
                if(nums[i]>nums[j]){
                    maxx=Math.max(maxx,dp[j]);
                    dp[i]=1+maxx;
                }
                j--;
            }
            res=Math.max(res,dp[i]);
        }
        int ress=0;
        for(int i=n-1;i>=idx;i--){
             int j=i-1;
            int maxx=0;
            while(j>=0){
                if(nums[i]>nums[j]){
                    maxx=Math.max(maxx,dp[j]);
                    dp[i]=1+maxx;
                }
                j--;
            }
            ress=Math.max(ress,dp[i]);
        }
        return n-(res+ress-1);
    }
}