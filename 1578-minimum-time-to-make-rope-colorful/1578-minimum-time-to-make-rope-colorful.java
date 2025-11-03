class Solution {
    public int minCost(String colors, int[] time) {
        int n=colors.length();
        int  ans=0;
        int i=0;
        while(i<n){
            char ch=colors.charAt(i);
            int total=0;
            int max=0;
            int j=i;
            while(j<n && ch==colors.charAt(j)){
                total+=time[j];
                max=Math.max(max,time[j]);
                j++;
            }
            ans+=total-max;
            i=j;
        }
        return ans;
    }
}