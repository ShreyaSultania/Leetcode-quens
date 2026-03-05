class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int price=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<price){
                price=prices[i];
            }
            else{
               int profit=prices[i]-price;
               maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}