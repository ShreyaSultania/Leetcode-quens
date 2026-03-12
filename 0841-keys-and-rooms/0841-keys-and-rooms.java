class Solution {
    void dfs(int val,List<List<Integer>>adj,boolean []visited){
        visited[val]=true;
        for(int i=0;i<adj.get(val).size();i++){
            if(!visited[adj.get(val).get(i)]){
                dfs(adj.get(val).get(i),adj,visited);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>>adj) {
        int n=adj.size();
        boolean []visited=new boolean[n];
        dfs(0,adj,visited);
        for(int i=0;i<n;i++){
            if(visited[i]==false) return false;
        }
        return true;
    }
}