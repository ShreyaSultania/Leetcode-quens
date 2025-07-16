class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n<=0) return false;
        // if((n & (n-1))==0) return true;
        // return false;
        if(n<=0) return false;
        while(n>1){
            int rem=n%2;
            if(rem==1) return false;
            n=n/2;
        }
        return true;
    }
}