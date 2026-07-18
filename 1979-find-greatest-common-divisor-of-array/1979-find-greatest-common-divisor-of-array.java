class Solution {
    int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.print(max+" "+min);
        return gcd(max,min);
    }
}