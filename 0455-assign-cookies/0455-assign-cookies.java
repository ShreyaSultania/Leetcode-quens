class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int a=g.length;
       int b=s.length;
       Arrays.sort(g);
       Arrays.sort(s);
       int i=0;
       int j=0;
       while(i<a && j<b){
        if(s[j]>=g[i]) i++;
         j++;
       }
       return i;
    }
}