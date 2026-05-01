class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int max=0;
        int n=nums.length;
        while(j<n){
            if(nums[j]==0){
                i=j+1;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}