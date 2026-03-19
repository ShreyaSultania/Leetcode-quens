class Solution {
    List<Integer>temp;
    void bfs(List<List<Integer>>adj,int []indegree,boolean []visited){
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
    public boolean canFinish(int num, int[][] pre) {
        temp=new ArrayList<>();
        List<List<Integer>>adj=new ArrayList<>();
        int []indegree=new int[num];
        for(int i=0;i<num;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        boolean []visited=new boolean[num];
        bfs(adj,indegree,visited);
        if(temp.size()==num) return true;
        return false;
    }
}