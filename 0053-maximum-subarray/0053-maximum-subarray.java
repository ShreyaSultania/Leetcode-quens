class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum<0){
                max=Math.max(max,sum);
                sum=0;
            }
            else{
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}