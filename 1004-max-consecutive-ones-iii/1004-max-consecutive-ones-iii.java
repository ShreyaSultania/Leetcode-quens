class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int maxLength=0;
         int flip=0;
        while(j<n){
            if(nums[j]!=1){
               flip++;
               while(flip>k){
                    if(nums[i]!=1){
                        flip--;
                    }
                    i++;
                }
            }
            maxLength=Math.max(maxLength,(j-i+1));
            j++;
        }
        return maxLength;
    }
}