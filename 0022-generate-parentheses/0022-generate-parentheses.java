class Solution {
    void helper(List<String>ans,String temp,int n,int left,int right){
        if(temp.length()==2*n){
            ans.add(temp);
            return;
        }
        if(left<n)helper(ans,temp+'(',n,left+1,right);
        if(left>right) helper(ans,temp+')',n,left,right+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        helper(ans,"",n,0,0);
        return ans;
    }
}