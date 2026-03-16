class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){
            int ch=s.charAt(i);
            int ch1=s.charAt(i+1);
            sum+=Math.abs(ch-ch1);
        }
        return sum;
    }
}