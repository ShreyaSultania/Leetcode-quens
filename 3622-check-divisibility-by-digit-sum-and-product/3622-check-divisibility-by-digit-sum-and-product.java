class Solution {
    int helper(int n){
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            mul*=rem;
            n=n/10;
        }
        return sum+mul;
    }
    public boolean checkDivisibility(int n) {
        int newNum=helper(n);
        if(n%newNum==0) return true;
        return false;
    }
}