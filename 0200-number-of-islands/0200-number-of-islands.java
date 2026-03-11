class Solution {
    void dfs(int i,int j,char[][]adj,boolean [][]visited){
        if(i>=0 && j>=0 && i<adj.length && j<adj[0].length && adj[i][j]=='1' && !visited[i][j]){
            visited[i][j]=true;
            int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};
            for(int []d:dir){
                int row=i+d[0];
                int col=j+d[1];
                dfs(row,col,adj,visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean [][]visited=new boolean[row][col];
        int c=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    c++;
                }
            }
        }
        return c;
    }
}