class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ans="";
        String ans1="";
      Stack<Character>st=new Stack<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='#' && st.size()>0) st.pop();
        else st.push(ch);
      }
      while(!st.isEmpty()){
        ans+=st.pop();
      }
      System.out.print(ans);
       for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        if(ch=='#' && st.size()>0) st.pop();
        else st.push(ch);
      }
      while(!st.isEmpty()){
        ans1+=st.pop();
      }
      return ans.equals(ans1);
    }
}