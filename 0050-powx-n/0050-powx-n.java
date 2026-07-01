class Solution {
    double helper(double x,long n){
        if(n==0) return 1.0;
        double k=helper(x,n/2);
        if(n%2!=0) return x*k*k;
        return k*k;
    }
    public double myPow(double x, int n) {
        if(n<0){
            long N=n;
            return 1.0/helper(x,-N);
        }
        return helper(x,n);
    }
}