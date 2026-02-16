class Solution {
    void helper(int n,String s,List<String>ans){
        if(s.length()==n){
            ans.add(s);
            return;
        }
       if(s.length()==0 || s.charAt(s.length()-1)!='0') helper(n,s+"0",ans);
        helper(n,s+"1",ans);
    }
    public List<String> validStrings(int n) {
        List<String>ans=new ArrayList<>();
        helper(n,"",ans);
        return ans;
    }
}