class Solution {
    public int reverse(int x) {
        int temp=x;
        
        long n=0;
        while(temp!=0){
            int rem=temp%10;
            n=n*10+rem;
            temp=temp/10;
        }
        if(n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE) return 0;
        return (int)n;
    }
}