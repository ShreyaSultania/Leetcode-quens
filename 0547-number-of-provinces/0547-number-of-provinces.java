class Solution {
    void bfs(int i,boolean[]visited,int[][]adj,int n){
        visited[i]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(q.size()!=0){
            int front=q.remove();
            for(int k=0;k<n;k++){
                if(adj[front][k]==1 && visited[k]==false){
                    q.add(k);
                    visited[k]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        int c=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,adj,n);
                c++;
            }
        }
        return c;
    }
}