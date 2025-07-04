class Solution {
    void fun(int n, List<String>ans,String s,int open,int close){
        if(close==n){
            ans.add(s);
            return;
        }
        if(open<n){
                fun(n,ans,s+'(',open+1,close);
        }
        if(open>close){
                fun(n,ans,s+')',open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        int close=0;
        int open=0;
        String s="";
    fun(n,ans,s,open,close);
    return ans;
    }
}