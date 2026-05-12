class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        int prod=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
            maxProd=Math.max(maxProd,prod);
            if(prod==0) prod=1;
        }
        prod=1;
         for(int i=n-1;i>=0;i--){
            prod=prod*nums[i];
            maxProd=Math.max(maxProd,prod);
                        if(prod==0) prod=1;

        }
        return maxProd;
    }
}