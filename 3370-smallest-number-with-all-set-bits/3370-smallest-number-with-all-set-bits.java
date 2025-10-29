class Solution {
    boolean pow(int n){
       String s="";
       while(n>1){
        int rem=n%2;
        s+=rem;
        n=n/2;
       }
       s+=n;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='0') return false;
       }
       return true;
    }
    public int smallestNumber(int n) {
        if(n==1) return 1;
        for(int i=2;i<=1000;i++){
            if(i>=n && pow(i)){
                return i;
            }
        }
        return -1;
    }
}