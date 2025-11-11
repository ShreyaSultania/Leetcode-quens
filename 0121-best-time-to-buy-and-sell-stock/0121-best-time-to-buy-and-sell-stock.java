class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int price=Integer.MAX_VALUE;
        int profit=0;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<price){
                price=nums[i];
                idx=i;
            }
            else{
                if(nums[i]-price>profit){
                    profit=Math.max(profit,(nums[i]-price));
                }
            }
        }
        return profit;
    }
}