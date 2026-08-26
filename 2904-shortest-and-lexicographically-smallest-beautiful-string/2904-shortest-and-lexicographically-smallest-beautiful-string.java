class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        int len=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1') c++;
                String curr=s.substring(i,j+1);
                if(c==k){
                    if(len>j-i+1){
                        len=j-i+1;
                        ans=curr;
                    }
                    else if(len==j-i+1){
                        len=j-i+1;
                        if(curr.compareTo(ans)<0){
                            ans=curr;
                        }

                    }
                    
                }
            }
        }
        return ans;
    }
}