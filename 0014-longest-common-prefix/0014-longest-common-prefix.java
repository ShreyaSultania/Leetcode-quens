class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String a=strs[0];
        String b=strs[n-1];
        String ans="";
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            char ch=a.charAt(i);
            char ch1=b.charAt(i);
            if(ch==ch1){
                ans+=ch;
            }
            else{
                break;
            }
        }
        return ans;
    }
}