class Solution {
    void dfs(int[][] grid, int sr, int sc,int oldColour, int color){       
        int row=grid.length;
        int col=grid[0].length;
        if(sr==row || sc==col || sr<0 || sc<0 || grid[sr][sc]!=oldColour || grid[sr][sc]==color){
            return;
        }
        grid[sr][sc]=color;
        dfs(grid,sr,sc+1,oldColour,color);
         dfs(grid,sr-1,sc,oldColour,color);
          dfs(grid,sr,sc-1,oldColour,color);
           dfs(grid,sr+1,sc,oldColour,color);
    }
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {
       
       int oldColour=grid[sr][sc];
       dfs(grid,sr,sc,oldColour,color);
       return grid;
    }
}