class Solution {
    boolean bfs(  ArrayList<ArrayList<Integer>>adj,int[]coloured,int node){
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        coloured[node]=1;
        while(q.size()>0){
            int val=q.remove();
            int colour=coloured[val];
            for(int i=0;i<adj.get(val).size();i++){
                if(coloured[adj.get(val).get(i)]==0){
                    q.add(adj.get(val).get(i));
                    coloured[adj.get(val).get(i)]=3-colour;
                }
                else if(coloured[adj.get(val).get(i)]!=0 && coloured[val]==coloured[adj.get(val).get(i)]) return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int row=graph.length;
        int col=graph[0].length;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<row;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        int[]coloured=new int[row];
        //red->1
        //blue->2
        for(int i=0;i<row;i++){
            if(coloured[i]==0)
            if(!bfs(adj,coloured,i)) return false;
        }
        
    return true;
    }
}