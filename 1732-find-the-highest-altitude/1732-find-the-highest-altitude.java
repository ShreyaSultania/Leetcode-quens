class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int altitude=0;
        int prefix[]=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+gain[i];
            altitude=Math.max(altitude,prefix[i+1]);
        }
        return altitude;
    }
}