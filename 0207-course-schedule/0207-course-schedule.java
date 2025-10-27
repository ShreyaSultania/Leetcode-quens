class Solution {
    public boolean canFinish(int num, int[][] pre) {
       List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<num;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            adj.add(arr);
        }

         int in[]=new int[num];
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            // v->u
            adj.get(v).add(u);
            in[u]++;
        }
      
       ArrayList<Integer>topo=new ArrayList<>();
       Boolean visited[]=new Boolean[num];
      Queue<Integer>q=new LinkedList<>();
      for(int i=0;i<num;i++){
        if(in[i]==0){
            q.add(i);
            visited[i]=true;
        }
      }
      while(!q.isEmpty()){
        int a=q.remove();
        topo.add(a);
        for(int i=0;i<adj.get(a).size();i++){
            in[adj.get(a).get(i)]--;
            if(in[adj.get(a).get(i)]==0){
                q.add(adj.get(a).get(i));
                visited[adj.get(a).get(i)]=true;
                
            }
        }
      }
  if(num==topo.size()) return true;
  return false;
    }
}