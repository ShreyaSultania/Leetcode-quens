class Solution {
    int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum=0;
        int oddSum=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0) evenSum+=i;
            else oddSum+=i;
        }
        return gcd(evenSum,oddSum);
    }
}