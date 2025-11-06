class Solution {
    public int networkDelayTime(int[][] times, int n, int src) {
        // bellmanford algo
        int dis[]=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i==src) dis[i]=0;
            else  dis[i]=Integer.MAX_VALUE;
        }
        for(int x=1;x<=n-1;x++){
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int distance=times[i][2];
            if(dis[u]==Integer.MAX_VALUE) continue;
            int totalDis=distance+dis[u];
            if(dis[v]>totalDis){
                dis[v]=totalDis;
            }
        }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE){
                return -1;
            }
            if(dis[i]>max) max=dis[i];
        }
        return max;
    }
}