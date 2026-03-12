class Solution {
    void dfs(int i,int j,int[][]grid){
        int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};
            grid[i][j]=0;
            for(int[]d:dir){
                int ni=i+d[0];
                int nj=j+d[1];
                if(ni>=0 && nj>=0 && ni<grid.length-1 && nj<grid[0].length && grid[ni][nj]==1)
                dfs(ni,nj,grid);
                }
    }
    public int numEnclaves(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<col;i++){
            if(grid[0][i]==1){
                dfs(0,i,grid);
            }
            if(grid[row-1][i]==1){
                dfs(row-1,i,grid);
            }
        }
        for(int i=0;i<row;i++){
            if(grid[i][0]==1){
                dfs(i,0,grid);
            }
            if(grid[i][col-1]==1){
                dfs(i,col-1,grid);
            }
        }
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1) c++;
            }
        }
        return c;
    }
}