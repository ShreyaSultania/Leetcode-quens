class Solution {
    public int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);
        int l=0;
        long max=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(long)nums[i];
            while((long)nums[i]*(i-l+1)-sum>k){
                sum=sum-nums[l];
                l++;
            }
            max=Math.max(max,(i-l+1));
        }
        return (int)max;
    }
}