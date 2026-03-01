class Solution {
    int subarray(int []nums,int k){
        int i=0;
        int j=0;
        int n=nums.length;
        int odd=0;
        int c=0;
        while(j<n){
            if(nums[j]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[i]%2!=0){
                    odd--;
                }
                i++;
            }
            c+=(j-i+1);
            j++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return subarray(nums,k)-subarray(nums,k-1);
    }
}