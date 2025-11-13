class Solution {
    public int maxProfit(int[] nums) {
        int profit=0;
        int price=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<price){
                price=nums[i];
            }
            else{
                if(nums[i]-price>0){
                    profit+=(nums[i]-price);
                    price=nums[i];

                }
            }
        }
        return profit;
    }
}