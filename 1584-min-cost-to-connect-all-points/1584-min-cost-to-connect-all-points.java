class Triplet implements Comparable <Triplet>{
    int node;
    int parent;
    int dist;
    Triplet (int node, int parent, int dist){
        this.node=node;
        this.parent=parent;
        this.dist=dist;
    }
    public int compareTo(Triplet t){
        if(this.dist==t.dist) return this.node-t.node;
        return this.dist-t.dist;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int sum=0;
        int n=points.length;
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        pq.add(new Triplet(0,-1,0));
        boolean visited[]=new boolean[n];
        while(!pq.isEmpty()){
            Triplet t=pq.remove();
            int node=t.node;
            int parent=t.parent;
            int dist=t.dist;
            if(visited[node]==true) continue;
            sum+=dist;
            visited[node]=true;
            for(int i=0;i<n;i++){
                if(i==node || i==parent) continue;
                if(visited[i]==true) continue;
                int x1=points[node][0];
                int y1=points[node][1];
                int x2=points[i][0];
                int y2=points[i][1];
                int Mdis=Math.abs(x2-x1)+Math.abs(y2-y1);
                pq.add(new Triplet(i,node,Mdis));
            }
            
        }
        return sum;
    }
}