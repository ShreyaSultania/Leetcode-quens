class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int lead=0;
        int ele=-1;
        for(int i=0;i<n;i++){
            if(lead==0){
                ele=nums[i];
            }
            if(nums[i]==ele) lead++;
            else lead--;
        }
        return ele;
    }
}