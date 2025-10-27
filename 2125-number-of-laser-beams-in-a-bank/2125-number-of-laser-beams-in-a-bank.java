class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int prev=0;
        int curr=0;
        for(int i=0;i<n;i++){
            int c=0;
            String str=bank[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    c++;
                }
            }
            if(c>0){
            curr+=prev*c;
            prev=c;
            }
        }
        return curr;
    }
}