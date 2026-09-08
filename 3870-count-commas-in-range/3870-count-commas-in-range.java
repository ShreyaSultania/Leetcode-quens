class Solution {
    int length(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public int countCommas(int n) {
        int commas=0;
        for(int i=1000;i<=n;i++){
            
                commas+=(length(i)-1)/3;
            
        }
        return commas;
    }
}