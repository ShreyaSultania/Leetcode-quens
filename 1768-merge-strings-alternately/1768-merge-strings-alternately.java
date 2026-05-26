class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String s="";
        int m=word1.length();
        int n=word2.length();
        while(i<m || j<n){
            if(i<m){
                s+=word1.charAt(i);
            }
            if(j<n){
                 s+=word2.charAt(i);
            }
            i++;
            j++;
        }
        return s;
    }
}