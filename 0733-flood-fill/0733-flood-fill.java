class Solution {
    void dfs(int[][] adj, int sr, int sc, int color,int oldColor){
        int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};
        for(int[]d:dir){
            int row=sr+d[0];
            int col=sc+d[1];
            if(row>=0 && row<adj.length && col>=0 && col<adj[0].length && adj[row][col]==oldColor){
                adj[row][col]=color;
                dfs(adj,row,col,color,oldColor);
            }
        }
    }
    public int[][] floodFill(int[][] adj, int sr, int sc, int color) {
        int oldColor=adj[sr][sc];
        if(oldColor==color) return adj;
        adj[sr][sc]=color;
        dfs(adj,sr,sc,color,oldColor);
        return adj;
    }
}