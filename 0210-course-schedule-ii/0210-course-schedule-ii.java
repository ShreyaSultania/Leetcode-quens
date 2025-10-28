class Solution {
    public int[] findOrder(int n, int[][] pre) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            adj.add(arr);
        }
        int visited[]=new int[n];
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            adj.get(v).add(u);
            visited[u]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer>topo=new ArrayList<>();
        while(!q.isEmpty()){
            int ele=q.remove();
            topo.add(ele);
            for(int i=0;i<adj.get(ele).size();i++){
                visited[adj.get(ele).get(i)]--;
                if(visited[adj.get(ele).get(i)]==0){
                    q.add(adj.get(ele).get(i));
                }
            }
        }
        int ans[]=new int[topo.size()];
        for(int i=0;i<topo.size();i++){
            ans[i]=topo.get(i);
        }
        return ans;
    }  
}