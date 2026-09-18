class Solution {
    public boolean rotateString(String s1, String s2) {
        String temp=s1+s1;
        if(s1.length()!=s2.length()) return false;
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<n+n-m;i++){
            String t=temp.substring(i,m+i);
                if(t.equals(s2)) return true;
        }
        return false;
    }
}