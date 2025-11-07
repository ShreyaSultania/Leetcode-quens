class Solution {
    public int findTheCity(int n, int[][] edges, int d) {
        int [][]dis=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) dis[i][j]=0;
                else dis[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            dis[u][v]=wt;
            dis[v][u]=wt;
        }
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                if (dis[i][k] != Integer.MAX_VALUE && dis[k][j] != Integer.MAX_VALUE)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
            }
        }
    }
        int idx=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int ans=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(dis[i][j]<=d) ans++;
            }
            if(ans<=min && idx<i) {
                min=ans;
                idx=i;
        }
       
    }
     return idx;
    }
}