class Solution {
    public int maxSubArray(int[] nums) {
        // KADANE ALGORITHM IN WHICH WE CAN FIND MAXIMUM SUM OF SUBARRAY
        int n=nums.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum<=0){
                maxSum=Math.max(maxSum,sum);
                 sum=0;
            }
            else maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}