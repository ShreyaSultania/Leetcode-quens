class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int []outdegree=new int[n];
        for(int i=0;i<n;i++){
            outdegree[i]=graph[i].length;
            for(int ele:graph[i]){
                adj.get(ele).add(i);
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(outdegree[i]==0){
                q.add(i);
            }
        }
        boolean visited[]=new boolean[n];
        while(q.size()>0){
            int node=q.remove();
            visited[node]=true;
            for(int ele:adj.get(node)){
                outdegree[ele]--;
                if(outdegree[ele]==0){
                    q.add(ele);
                }
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                ans.add(i);
            }
        }
        return ans;
    }
}