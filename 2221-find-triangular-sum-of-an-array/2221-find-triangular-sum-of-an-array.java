class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int  newNums[]=new int[n];
        for(int i=0;i<n;i++){
            newNums[i]=nums[i];
        }
        while(n>1){
        for(int i=0;i<n-1;i++){
           int sum=(newNums[i]+newNums[i+1])%10;
           newNums[i]=sum;
        }
        n--;
    }
    return newNums[0];
    }
}