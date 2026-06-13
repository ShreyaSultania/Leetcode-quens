class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n==1) return "";
        StringBuilder sb=new StringBuilder(palindrome);
        int i=0;
        int j=n/2;
        boolean flag=false;
        while(i<j){
            if(palindrome.charAt(i)!='a'){
                sb.setCharAt(i,'a');
                flag=true;
                break;
            }
            i++;
        }
        if(!flag) sb.setCharAt(n-1,'b');
        return sb.toString();
    }
}