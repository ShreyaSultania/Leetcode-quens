class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // reverse the graph
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            adj.add(arr);
        }
        int visited[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                // in original i to j;
                // reverse j to i
                adj.get(graph[i][j]).add(i);
                visited[i]++;
            }
        }
        ArrayList<Integer>top=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
           if(visited[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int ele=q.remove();
            top.add(ele);
            for(int i=0;i<adj.get(ele).size();i++){
                visited[adj.get(ele).get(i)]--;
                if(visited[adj.get(ele).get(i)]==0){
                    q.add(adj.get(ele).get(i));
                }
            }
        }
        Collections.sort(top);
        return top;
    }
}