class Solution {
    int MOD=1000000007;
    long factorial(int x,long n){
        if(n==0) return 1;
        long k=factorial(x,n/2);
        if(n%2!=0){
            return (x*k*k)% MOD;
        }
        return (k*k)% MOD;
    }
    public int countGoodNumbers(long n) {
        long even=0;
        long odd=0;
        if(n%2==0){
            even=n/2;
            odd=n/2;
        }
        else{
            even=n/2+1;
            odd=n/2;
        }
        int a=(int)((factorial(5,even)*factorial(4,odd))%MOD);
        return a;
    }
}