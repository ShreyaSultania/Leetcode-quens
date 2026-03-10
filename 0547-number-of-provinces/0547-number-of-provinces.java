class Solution {
    void dfs(int val,int[][] adj,boolean []visited){
        visited[val]=true;
        for(int i=0;i<adj[0].length;i++){
            if(adj[val][i]==1 && !visited[i]){
                dfs(adj[val][i],adj,visited);
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int c=0;
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                c++;
            }
        }
        return c;
    }
}