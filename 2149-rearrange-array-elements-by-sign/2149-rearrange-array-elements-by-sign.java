class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int pIdx=0;
        int nIdx=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pIdx]=nums[i];
                pIdx+=2;
            }
            else if(nums[i]<0){
                ans[nIdx]=nums[i];
                nIdx+=2;
            }
        }
        return ans;
    }
}