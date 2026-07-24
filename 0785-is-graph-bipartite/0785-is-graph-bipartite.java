class Triplet{
    int val;
    int parent;
    int colour;
    Triplet(int val,int parent,int colour){
        this.val=val;
        this.parent=parent;
        this.colour=colour;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        //red=1;
        //blue=0;
        int n=graph.length;
        int []colour=new int[n];
        boolean[]visited=new boolean[n];
        for(int i=0;i<n;i++){
            colour[i]=-1;
        }
        Queue<Triplet>q=new LinkedList<>();
        for(int j=0;j<n;j++){
          if(visited[j]) continue;
        q.add(new Triplet(j,-1,1));
        visited[j]=true;
        colour[j]=1;
        while(q.size()>0){
            Triplet t=q.remove();
            for(int i=0;i<graph[t.val].length;i++){
                if(!visited[graph[t.val][i]]){
                q.add(new Triplet(graph[t.val][i],t.val,1-t.colour));
                colour[graph[t.val][i]]=1-colour[t.val];
                visited[graph[t.val][i]]=true;
                }
                else if(colour[graph[t.val][i]]==colour[t.val]) return false;
            }
        }
        }
        return true;
    }
}