class Solution {
    int sum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int k=sum(nums[i]);
            min=Math.min(k,min);
        }
        return min;
    }
}