class Solution {
    int digitProduct(int n){
        int p=1;
        while(n!=0){
            int rem=n%10;
            p=p*rem;
            n=n/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        // digitProduct(n);
        if(digitProduct(n)%t==0) return n;
        for(int i=1;i<=t;i++){
             if((digitProduct(n+i))%t==0) return n+i;
        }
        return -1;
    }
}