class Pair{
    int node;
    int dist;
    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Triplet implements Comparable <Triplet>{
    int node;
    int dist;
    int stops;
    Triplet(int node, int dist,int stops){
        this.node=node;
        this.dist=dist;
        this.stops=stops;
    }
    public int compareTo(Triplet t){
        return this.dist-t.dist;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Pair>arr=new ArrayList<>();
            adj.add(arr);
        }
        for(int i=0;i<flights.length;i++){
            int u=flights[i][0];
            int v=flights[i][1];
            int dis=flights[i][2];
            adj.get(u).add(new Pair(v,dis));
        }
    int cost[]=new int[n];
    for(int i=0;i<n;i++){
        if(i==src) cost[i]=0;
        else cost[i]=Integer.MAX_VALUE;
    }
    PriorityQueue<Triplet>pq=new PriorityQueue<>();
    pq.add(new Triplet(src,0,0));
    while(!pq.isEmpty()){
        Triplet t=pq.remove();
        int node=t.node;
        int distance=t.dist;
        int stops=t.stops;
        if(node==dst) return distance;
        if(stops==k+1) continue;
        for(int p=0;p<adj.get(node).size();p++){
            int totalcost=distance+adj.get(node).get(p).dist;
            if(cost[adj.get(node).get(p).node]>totalcost){
                cost[adj.get(node).get(p).node]=totalcost;
                pq.add(new Triplet(adj.get(node).get(p).node,totalcost,stops+1));
            }
        }
    }
    return -1;
    }
}