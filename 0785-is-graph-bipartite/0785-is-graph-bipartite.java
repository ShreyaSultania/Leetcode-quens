class Solution {
    boolean bfs(int i,int []visited,int[][] adj){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        visited[i]=1; //1->red 0->blue
        while(!q.isEmpty()){
            int ele=q.remove();
            int colour=visited[ele];
            for(int k=0;k<adj[ele].length;k++){
                if(visited[adj[ele][k]]==visited[ele]) return false;
                if(visited[adj[ele][k]]==-1){
                    visited[adj[ele][k]]=1-colour;
                    q.add(adj[ele][k]);
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int []visited=new int[n];
        Arrays.fill(visited,-1);
        boolean ans=true;
        for(int i=0;i<n;i++){
            if(i==0 || visited[i]==-1){
                ans=bfs(i,visited,graph);
                if(ans==false) return false;
            }
        }
       return ans;
    }
}