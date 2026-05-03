class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit=0;
        int n=arr.length;
        int ele=arr[0];
        for(int i=1;i<n;i++){
            int profit=arr[i]-ele;
            if(profit<0){
                ele=arr[i];
            }
            maxProfit=Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}