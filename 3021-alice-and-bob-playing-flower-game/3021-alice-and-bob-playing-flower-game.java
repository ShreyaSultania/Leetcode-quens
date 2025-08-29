class Solution {
    public long flowerGame(int n, int m) {
       long xodd=(n+1)/2;
       long yeven=m/2;
       long xeven=n/2;
       long yodd=(m+1)/2;
       return (xodd*yeven)+(yodd*xeven);
        
    }
}