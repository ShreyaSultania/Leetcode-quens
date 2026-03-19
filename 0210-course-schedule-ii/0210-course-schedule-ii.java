class Solution {
    List<Integer>temp;
    void bfs(List<List<Integer>>adj, boolean[] visited,int []indegree){
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
                visited[i]=true;
            }
        }
        while(q.size()>0){
            int ele=q.remove();
            temp.add(ele);
            for(int i=0;i<adj.get(ele).size();i++){
                indegree[adj.get(ele).get(i)]--;
                if(indegree[adj.get(ele).get(i)]==0){
                    q.add(adj.get(ele).get(i));
                    visited[adj.get(ele).get(i)]=true;
                }
            }
        }
    }
    public int[] findOrder(int n, int[][] pre) {
        temp=new ArrayList<>();
        int[]ans=new int[n];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int []indegree=new int[n];
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        boolean[] visited=new boolean[n];
        bfs(adj,visited,indegree);
        if(temp.size()!=n) return new int[0];
        for(int i=0;i<temp.size();i++){
            ans[i]=temp.get(i);
        }
        return ans;
    }
}