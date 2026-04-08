class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=queries.length;
        int mod = 1000000007;
        long num[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int k=queries[i][2];
            int v=queries[i][3];
            for(int j=l;j<=r;j+=k){
                num[j]=(num[j]*v)%mod;
            }
        }
        long ans=0;
        for(int i=0;i<num.length;i++){
            ans=ans^num[i];
        }
        return (int)ans;
    }
}