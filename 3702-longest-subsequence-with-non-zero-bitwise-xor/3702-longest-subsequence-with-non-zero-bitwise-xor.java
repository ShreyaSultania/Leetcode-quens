class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int n=nums.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
            if(xor!=0){
                flag=true;
            }
        }
        if(!flag) return 0;
        if(xor==0) return n-1;
        return n;
    }
}