class Solution {
    boolean helper(String s,HashSet<String>set,int idx,int []dp){
        if(idx==s.length()){
            return true;
        }
        if(dp[idx]!=-1) return dp[idx]==1;
        
         boolean ans=false;
        for(int i=idx;i<s.length();i++){
            String temp=s.substring(idx,i+1);
            if(set.contains(temp)){
                if(helper(s,set,i+1,dp)) ans=true;
            } 
        }
        if(ans==false) dp[idx]=0;
        else dp[idx]=1;
        return ans;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        int[]dp=new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
       return helper(s,set,0,dp);
    }
}