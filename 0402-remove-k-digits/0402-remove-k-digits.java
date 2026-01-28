class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Integer>st=new Stack<>();
       int n=num.length();
        if(num.length()==k) return "0";
       for(int i=0;i<n;i++){
        int a=num.charAt(i)-'0';
        while(st.size()>0 && st.peek()>a && k>0){
            st.pop();
            k--;
        }
       st.push(a);
       }
       StringBuilder sb=new StringBuilder("");
       while(st.size()>0){
        sb.append(st.pop());
       }
       sb.reverse();
       while(sb.length()>0 && sb.charAt(0)=='0') sb.deleteCharAt(0);

        while(sb.length()>0 && k!=0) {
            sb.deleteCharAt(sb.length()-1);
            k--;
        }
        
        if(sb.length()==0) return "0";
       return sb.toString();
    }
}