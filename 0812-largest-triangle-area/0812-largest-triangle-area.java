class Solution {
    public double largestTriangleArea(int[][] points) {
        int maxx=Integer.MIN_VALUE;
        int maxy=Integer.MIN_VALUE;
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            maxx=Math.max(maxx,x);
            maxy=Math.max(maxy,y);
        }
        return 0.5*maxx*maxy;
    }
}