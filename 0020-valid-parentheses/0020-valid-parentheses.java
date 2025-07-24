class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()!=0){
           char top=st.peek();
            if(top=='(' && ch==')') st.pop();
            if(top=='{' && ch=='}') st.pop();
            if(top=='[' && ch==']') st.pop();
            }
            }
        }
        return st.isEmpty();
    }
}