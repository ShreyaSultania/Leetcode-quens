class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length;
        int maxLen=0;
        while(j<n){
            if(nums[j]!=1){
                i=j+1;
            }
            maxLen=Math.max(j-i+1,maxLen);
            j++;
        }
        return maxLen;
    }
}