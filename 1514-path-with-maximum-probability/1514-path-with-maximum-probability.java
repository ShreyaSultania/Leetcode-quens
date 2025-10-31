class Pair implements Comparable<Pair>{
    int node;
    double dis;
    Pair(int node,double dis){
        this.node=node;
        this.dis=dis;
    }
    public int compareTo(Pair p){
        return Double.compare(this.dis,p.dis);
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] cost, int start, int end) {
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Pair>arr=new ArrayList<>();
            adj.add(arr);
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double dis=cost[i];
            adj.get(u).add(new Pair(v,dis));
            adj.get(v).add(new Pair(u,dis));
        }
        double[]dist=new double[n];
        for(int i=0;i<n;i++){
            if(i==start) dist[i]=1.0;
            else dist[i]=Integer.MIN_VALUE;
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Pair(start,1));
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int currNode=p.node;
            double currDist=p.dis;
            for(int i=0;i<adj.get(currNode).size();i++){
                Pair neigh=adj.get(currNode).get(i);
                double totalDis=currDist*neigh.dis;
                if(dist[neigh.node]<totalDis){
                    dist[neigh.node]=totalDis;
                    pq.add(new Pair(neigh.node,totalDis));
                }
            }
        }
        if(dist[end]==Integer.MIN_VALUE) return 0.0;
        return dist[end];
    }
}