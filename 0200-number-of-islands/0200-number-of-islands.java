class Solution {
    public void dfs(char[][]grid,int i,int j,int row,int cols){
        if(i==row || j==cols || i<0 ||j<0 || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i,j+1,row,cols);
        dfs(grid,i-1,j,row,cols);
        dfs(grid,i,j-1,row,cols);
        dfs(grid,i+1,j,row,cols);
    }
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,row,col);
                    ans++;
                }
            }
        }
        return ans;
    }
}