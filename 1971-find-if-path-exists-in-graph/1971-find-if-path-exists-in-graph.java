class Solution {
    void bfs( List<List<Integer>>adj,int src,boolean []visited){
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        visited[src]=true;
        while(q.size()>0){
            int e=q.remove();
            for(int i=0;i<adj.get(e).size();i++){
                if(!visited[adj.get(e).get(i)]){
                    q.add(adj.get(e).get(i));
                    visited[adj.get(e).get(i)]=true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>temp=new ArrayList<>();
            adj.add(temp);
        }
        boolean []visited=new boolean[n];
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        bfs(adj,source,visited);
        if(visited[destination]) return true;
        return false;
    }
}