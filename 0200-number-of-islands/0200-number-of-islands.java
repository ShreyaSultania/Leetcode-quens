class Solution {
    void dfs(int i,int j,boolean[][]visited,char[][]grid){
          int m=grid.length;
        int n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || visited[i][j]) return;
        if(grid[i][j]!='1') return;
        visited[i][j]=true;
        int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};
        for(int []d :dir){
            dfs(i+d[0],j+d[1],visited,grid);
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,visited,grid);
                    c++;
                }
            }
        }
        return c;
    }

}