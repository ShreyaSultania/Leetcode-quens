class Solution {
    static boolean ans=true;
    void dfs(int i, List<List<Integer>>adj, boolean visited[], boolean path[]){
        visited[i]=true;
        path[i]=true;
        for(int j=0;j<adj.get(i).size();j++){
            if(path[adj.get(i).get(j)]==true){
               ans=false;
                return;
            }
            if(!visited[adj.get(i).get(j)] && !path[adj.get(i).get(j)]){
                dfs(adj.get(i).get(j),adj,visited,path);
            }
        }
         path[i]=false;
    }
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            adj.add(arr);
        }
        
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            adj.get(v).add(u);
        }
     boolean visited[]=new boolean[n];
     boolean path[]=new boolean[n];
     dfs(0,adj,visited,path);
     return ans;
    }
}