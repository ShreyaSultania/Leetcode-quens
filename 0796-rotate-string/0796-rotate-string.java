class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String temp=s+s;
        for(int i=0;i<s.length();i++){
            String ans=temp.substring(i,i+n);
            if(ans.equals(goal)) return true;

        }
        return false;
    }
}