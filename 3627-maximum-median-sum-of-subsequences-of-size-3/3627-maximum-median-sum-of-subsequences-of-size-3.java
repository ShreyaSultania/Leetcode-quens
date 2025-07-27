class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=nums.length-2;i>0;i-=2){
            
                sum=sum+nums[i];
        }
        
        return sum;
    }
}