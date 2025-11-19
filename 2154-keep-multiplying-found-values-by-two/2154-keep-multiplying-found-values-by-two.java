class Solution {
    boolean found(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return true;
            
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        while(found(nums,original)){
            original=2*original;
        }
        return original;
    }
}