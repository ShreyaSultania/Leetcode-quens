class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0 || st.peek()!=ch){
                st.push(ch);
            }
            else st.pop();
        }
        StringBuilder sb=new StringBuilder("");
        while(st.size()!=0){
            char ele=st.pop();
            sb.append(ele);
        }
        sb=sb.reverse();
        return sb.toString();
    }
}