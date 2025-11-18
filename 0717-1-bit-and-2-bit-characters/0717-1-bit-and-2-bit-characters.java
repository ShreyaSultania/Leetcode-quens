class Solution {
    public boolean isOneBitCharacter(int[] nums) {
       int one=0;
       int two=0;
       for(int i=0;i<nums.length-1;i++) {
        if((nums[i]==1 && nums[i+1]==0) ||(nums[i]==1 && nums[i+1]==1)){
                two++;
        }
        else one++;
       }
       if(nums.length%2!=0){
        if(nums[nums.length-1]==0) one++;
       }
       if(one==0) return false;
       return true;
    }
}