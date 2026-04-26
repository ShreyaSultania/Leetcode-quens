class Solution {
    boolean dfs(int i,int j, boolean [][]visited,char[][] grid,char ch,int pi,int pj){
         int m=grid.length;
        int n=grid[0].length;
         visited[i][j]=true;
            int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};
            for(int []d:dir){
                int ni=i+d[0];
                int nj=j+d[1];
                if(ni>=0 && nj>=0 && nj<n && ni<m && grid[ni][nj]==ch){
                if(!visited[ni][nj]) {
                    if(dfs(ni,nj,visited,grid,ch,i,j))
                    return true;
                }
                else if(ni!=pi || nj!=pj) return true;
            }
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char ch=grid[i][j];
                if(!visited[i][j]) {
                    if(dfs(i,j,visited,grid,ch,-1,-1))
                    return true;
                }
            }
        }
        return false;
    }
}