class Solution {
    void helper(ArrayList<String>ans,String s,int n){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        if((s.length()==0) || s.charAt(s.length()-1)!='a') helper(ans,s+'a',n);
       if(s.length()==0 || s.charAt(s.length()-1)!='b') helper(ans,s+'b',n);
       if(s.length()==0 || s.charAt(s.length()-1)!='c') helper(ans,s+'c',n);
    }
    public String getHappyString(int n, int k) {
        ArrayList<String>ans=new ArrayList<>();
        helper(ans,"",n);
        if(k>ans.size()) return "";
        return ans.get(k-1);
    }
}