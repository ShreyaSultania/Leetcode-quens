class Solution {
    public long numberOfWeeks(int[] nums) {
        int n=nums.length;
        long max=0;
        long sum=0;
        for(long ele:nums){
            sum+=ele;
            max=Math.max(max,ele);
        }
        if(max<sum-max+1) return (long)sum;
        else return (long)2*(sum-max)+1;
    }
}