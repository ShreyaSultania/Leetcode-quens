class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<String>st=new Stack<>();
        for(int i=0;i<n;i++){
            String ch=tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int a=Integer.valueOf(st.pop());
                int b=Integer.valueOf(st.pop());
                if(ch.equals("+")) st.push(String.valueOf(b+a));
                else if(ch.equals("-")) st.push(String.valueOf(b-a));
                else if(ch.equals("*")) st.push(String.valueOf(b*a));
                else if(ch.equals("/")) st.push(String.valueOf(b/a));
                
            }
            else{
                st.push(ch);
            }
        }
        return Integer.valueOf(st.peek());
    }
}