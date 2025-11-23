class Pair{
    char ele;
    int freq;
    Pair(char ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder ans=new StringBuilder("");
        Stack<Pair>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()>0 && st.peek().ele==ch){
               st.peek().freq++;
               if(st.peek().freq==k){
                    st.pop();
                }
            }
            else{
                st.push(new Pair(ch,1));
            }
            }
            while(st.size()>0){
                Pair p=st.pop();
                for(int i=0;i<p.freq;i++){
                ans.append(p.ele);
                }
            }
            return ans.reverse().toString();
        }
    }
