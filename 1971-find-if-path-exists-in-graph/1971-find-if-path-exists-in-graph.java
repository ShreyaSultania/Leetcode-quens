class Solution {
    void bfs(int src,List<List<Integer>>adj,boolean []visited){
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        visited[src]=true;
        while(q.size()>0){
            int ele=q.remove();
            for(int i=0;i<adj.get(ele).size();i++){
                if(!visited[adj.get(ele).get(i)]){
                    q.add(adj.get(ele).get(i));
                    visited[adj.get(ele).get(i)]=true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>adj=new ArrayList<>();
        int row=edges.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<row;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean []visited=new boolean[n];
        bfs(source,adj,visited);
        if(visited[destination]==true) return true;
        return false;
    }
}