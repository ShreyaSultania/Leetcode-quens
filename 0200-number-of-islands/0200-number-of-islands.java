class Solution {
    void dfs(int i,int j,char[][]grid, boolean [][]visited){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || i<0 || j>=n ||j<0|| grid[i][j]!='1' || visited[i][j]) return;
        visited[i][j]=true;
        dfs(i+1,j,grid,visited);
        dfs(i,j+1,grid,visited);
        dfs(i-1,j,grid,visited);
        dfs(i,j-1,grid,visited);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visited=new boolean[m][n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    c++;
                }
            }
        }
        return c;
    }
}