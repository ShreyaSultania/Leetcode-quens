class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        // while(n>1){
        //     int rem=n%4;
        //     if(rem!=0) return false;
        //     n=n/4;
        // }
        // return true;
        int s=(int)Math.sqrt(n);
        if(s*s==n){
            int p= s & (s-1);
            if(p==0) return true;
        }
        return false;
    }
}