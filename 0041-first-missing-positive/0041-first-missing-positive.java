class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if(n==1 && nums[0]==1) return 2;
        int []brr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
            brr[nums[i]-1]=nums[i];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(brr[i]==0) return i+1;
           else  c++;
        }
        if(c==n) return n+1;
        return n;
    }

}