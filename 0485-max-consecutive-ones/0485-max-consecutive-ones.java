class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        if(n==1 && nums[0]==1) return 1;
        int i=0;
        int j=i+1;
        int max=0;
        while(j<n){

            if(nums[i]!=nums[j]){
                i=j;
            }
            else if(nums[i]==1 && nums[j]==1){
                j++;
                max=Math.max(max,(j-i));
            }
            else if(nums[i]==0 && nums[j]==0){
                i++;
                j++;
            }
        }
        return max;
    }
}