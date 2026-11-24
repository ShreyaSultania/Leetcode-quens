class Solution {
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    int lcm(int a,int b){
        return (a / gcd(a, b)) * b;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int maxLen=0;
       for(int i=0;i<n;i++){
        int prod=1;
        int len=0;
        int a=nums[i];
        int b=nums[i];
        for(int j=i;j<n;j++){
            prod=prod*nums[j];
            a=gcd(a,nums[j]);
            b=lcm(b,nums[j]);
            if(prod==a*b){
                len=j-i+1;
            }
           
        }
        maxLen=Math.max(maxLen,len);
       }
       return maxLen;
    }
}