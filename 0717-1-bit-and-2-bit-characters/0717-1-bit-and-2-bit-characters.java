class Solution {
    public boolean isOneBitCharacter(int[] nums) {
      int n=nums.length;
      int i=0;
      while(i<n-1){
        if(nums[i]==1){
            i+=2;
        }
        else{
             i++;
        }
      }
      return i==n-1;
    }
}