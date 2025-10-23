class Solution {
    public boolean hasSameDigits(String s) {
       
        StringBuilder sb=new StringBuilder(s);
         int l=sb.length();
        while(sb.length()>2){
            for(int i=0;i<sb.length()-1;i++){
                int a=sb.charAt(i)-'0';
                int b=sb.charAt(i+1)-'0';
                char res=(char)((a+b)%10+'0');
                sb.setCharAt(i,res);
            }
           sb.deleteCharAt(sb.length() - 1);
        }
        if(sb.charAt(0)==sb.charAt(1)) return true;
        return false;
    }
}