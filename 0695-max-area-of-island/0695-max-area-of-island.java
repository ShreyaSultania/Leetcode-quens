class Solution {
    int c=0;
    void dfs(int [][]grid,int i,int j,boolean[][]visited){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=0 && j>=0 && i<m&& j<n && !visited[i][j] && grid[i][j]==1){
            visited[i][j]=true;
            c=c+1;
            dfs(grid,i+1,j,visited);
            dfs(grid,i-1,j,visited);
            dfs(grid,i,j+1,visited);
            dfs(grid,i,j-1,visited);
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visited=new boolean[m][n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    dfs(grid,i,j,visited);
                    max=Math.max(max,c);
                    c=0;
                }
            }
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}