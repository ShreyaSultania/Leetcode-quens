class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String st=s+s;
        System.out.println(st);
        for(int i=0;i<=n;i++){
            String temp=st.substring(i,n+i);
            // System.out.println(temp);
            if(temp.equals(goal)) return true;
        }
        return false;
    }
}