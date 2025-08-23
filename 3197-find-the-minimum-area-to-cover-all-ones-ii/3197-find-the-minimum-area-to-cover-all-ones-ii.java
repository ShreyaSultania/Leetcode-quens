class Solution {
    public int minimumArea(int grid[][],int rstart,int rend,int cstart,int cend){
         int row=grid.length;
        int col=grid[0].length;
        int xmin=Integer.MAX_VALUE;
        int xmax=Integer.MIN_VALUE;
        int ymin=Integer.MAX_VALUE;
        int ymax=Integer.MIN_VALUE;
         for(int i=rstart;i<rend;i++){
            for(int j=cstart;j<cend;j++){
                if(grid[i][j]==1){
                    xmin=Math.min(xmin,i);
                     xmax=Math.max(xmax,i);
                      ymin=Math.min(ymin,j);
                     ymax=Math.max(ymax,j);
                }
            }
        }
        int height=xmax-xmin+1;
        int width=ymax-ymin+1;
        return height*width;
    }
    public int helper(int [][]grid){
         int row=grid.length;
        int col=grid[0].length;
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                // case 1 
                //top
                // top-left top-right

                int top=minimumArea(grid,0,i,0,col);
                int left=minimumArea(grid,i,row,0,j);
                int right=minimumArea(grid,i,row,j,col);
                ans=Math.min(ans,(top+left+right));
                // case 2
                // bottom
                // bottom-left bottom-right
                int bleft=minimumArea(grid,0,i,0,j);
                int bright=minimumArea(grid,0,i,j,col);
                int bbottom=minimumArea(grid,i,row,0,col);
                ans=Math.min(ans,(bbottom+bleft+bright));
                
            }
        }
        // row split
        for(int i=1;i<row;i++){
            for(int j=i+1;j<row;j++){
                int ttop=minimumArea(grid,0,i,0,col);
                int tmid=minimumArea(grid,i,j,0,col);
                int tlast=minimumArea(grid,j,row,0,col);
                 ans=Math.min(ans,(ttop+tmid+tlast));
            }
        }
        return ans;
    }
    public int minimumSum(int[][] grid) {
         int row=grid.length;
        int col=grid[0].length;
       int rotatedArray[][]=new int[col][row];
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            rotatedArray[j][row-i-1]=grid[i][j];
        }
       }
      int c= helper(grid);
      int d=helper(rotatedArray);
      return Math.min(c,d);
    }
}