class Solution {
    // void dfs(int i,int j,int[][] adj,boolean [][]visited){
    //     if(i>=adj.length || j>=adj[0].length) return;
    //     if(adj[i][j]!=1) return;
    //     if(adj[i][j]==1) visited[i][j]=true;
    //     dfs(i+1,j,adj,visited);
    //     // dfs(i,j+1,adj,visited);
    // }
    void dfs(int i,int mat[][],boolean visited[]){
        int n=mat.length;
        visited[i]=true;
        for(int j=0;j<n;j++){
            if(!visited[j] && mat[i][j]==1){
                dfs(j,mat,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        // boolean [][]visited=new boolean[n][n];
        boolean visited[] = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            // for(int j=0;j<n;j++){
                // if(isConnected[i][j]==1 && visited[i][j]!=true){
                if(visited[i]!=true){
                    dfs(i,isConnected,visited);
                    c++;
                }
            // }
        }
        return c;
    }
}