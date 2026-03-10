class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
     int t=0;
     int fresh=0;
    void bfs(int[][]adj,Queue<Pair>q){
        int row=adj.length;
        int col=adj[0].length;
        while(q.size()>0){
            int size=q.size();
            for(int m=0;m<size;m++){
            Pair p=q.remove();
            int i=p.i;
            int j=p.j;
            int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};
            for(int[]d:dir){
                int ni=i+d[0];
                int nj=j+d[1];
                if(ni>=0 && nj>=0 && ni<row && nj<col && adj[ni][nj]==1){
                    adj[ni][nj]=2;
                    q.add(new Pair(ni,nj));
                    fresh--;
                }
            }
            }
            t++;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        bfs(grid,q);
        System.out.print(fresh);
        if(fresh>0) return -1;
        return t-1;
    }
}