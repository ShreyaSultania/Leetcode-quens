class Solution {
    public boolean isPalindrome(String sb) {
        sb=sb.toLowerCase().trim();
        String s="";
        for(int k=0;k<sb.length();k++){
            if(Character.isLetter(sb.charAt(k)) ||Character.isDigit(sb.charAt(k))){
                s+=sb.charAt(k);
            }
        }
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}