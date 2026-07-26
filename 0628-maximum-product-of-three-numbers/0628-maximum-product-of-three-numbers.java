class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int neg=0;
        for(int i=0;i<n;i++){
           if(nums[i]<0){
            neg++;
           }
        }
        int l=nums[n-1]*nums[n-2]*nums[n-3];
        int m=nums[0]*nums[1]*nums[n-1];
        return Math.max(l,m);
    }
}