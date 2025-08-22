class Solution {
    public int minimumArea(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int xmin=Integer.MAX_VALUE;
        int xmax=Integer.MIN_VALUE;
        int ymin=Integer.MAX_VALUE;
        int ymax=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1) {
                    xmin=Math.min(xmin,i);
                    xmax=Math.max(xmax,i);
                    ymin=Math.min(ymin,j);
                    ymax=Math.max(ymax,j);
            }
        }
    }
    int height=(xmax-xmin)+1;
    int width=(ymax-ymin)+1;
    return height*width;
    }
}