class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        int c=0;
        int maxLength=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                c++;
            }
            else if(st.size()>0 && ch==')'){
                st.pop();
                c--;
            } 
            maxLength=Math.max(maxLength,c);
        }
        return maxLength;
    }
}