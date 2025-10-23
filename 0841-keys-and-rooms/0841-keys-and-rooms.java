class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean visited[]=new boolean[n];
       visited[0]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
            while(!q.isEmpty()){
                int ele=q.remove();
                for(int k=0;k<adj.get(ele).size();k++){
                    if(!visited[adj.get(ele).get(k)]){
                         visited[adj.get(ele).get(k)]=true;
                        q.add(adj.get(ele).get(k));
                    }
                }
            }
    for(int i=0;i<n;i++){
        if(visited[i]==false) return false;
    }
    return true;
    }
}