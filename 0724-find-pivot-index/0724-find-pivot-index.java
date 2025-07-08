class Solution {
    public int pivotIndex(int[] nums) {
        //brute force
       int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        int left=0;
        for(int j=0;j<nums.length;j++){
            int  right=total-left-nums[j];
            if(left==right) return j;
            left=left+nums[j];
        }
        return -1;
    }
}