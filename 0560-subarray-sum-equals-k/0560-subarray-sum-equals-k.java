class Solution {
    public int subarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int sum=0;
        int c=0;
        while(j<n){
            sum+=nums[j];
            while(sum>k){
                sum-=nums[i];
                i++;
            }
            if(sum==k) c++;
            j++;
        }
        return c;
    }
}