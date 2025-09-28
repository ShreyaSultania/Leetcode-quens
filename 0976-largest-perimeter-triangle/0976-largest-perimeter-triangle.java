class Solution {
    public int largestPerimeter(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]>nums[k] && nums[k]+nums[j]>nums[i] && nums[k]+nums[i]>nums[j]){
                        int sum=nums[i]+nums[j]+nums[k];
                        max=Math.max(max,sum);
                    }
                }
            }
        }
        return max;
    }
}