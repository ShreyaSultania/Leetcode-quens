class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                sb=sb.append(sb);
            }
            else if(ch=='%'){
                sb=sb.reverse();
            }
            else if(ch=='*'){
                if(sb.length()>0) sb=sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb=sb.append(ch);
            }
        }
        return sb.toString();
    }
}