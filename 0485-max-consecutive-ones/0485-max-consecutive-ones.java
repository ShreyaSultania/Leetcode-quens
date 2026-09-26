class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int max=0;
        while(j<n){
            if(nums[j]==0){
                i=j+1;
            }
            j++;
            max=Math.max(max,j-i);
        }
        return max;
    }
}