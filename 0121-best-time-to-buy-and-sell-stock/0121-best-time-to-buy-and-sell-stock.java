class Solution {
    public int maxProfit(int[] nums) {
        int maxProfit=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                max=nums[i];
            }
            else if(nums[i]-max>maxProfit){
                maxProfit=nums[i]-max;
            }
        }
        return maxProfit;
    }
}