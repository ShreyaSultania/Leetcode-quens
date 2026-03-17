class Triplet{
    int r;
    int c;
    int steps;
    Triplet(int r,int c,int steps){
        this.r=r;
        this.c=c;
        this.steps=steps;
    }
}
class Solution {
     int[][]ans;
    void bfs(Queue<Triplet>q,boolean [][]visited,int[][] mat){
         int row=mat.length;
        int col=mat[0].length;
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        while(q.size()>0){
            Triplet t=q.remove();
            int i=t.r;
            int j=t.c;
            int steps=t.steps;
            ans[i][j]=steps;
            for(int[] d:dir){
            int r=t.r+d[0];
            int c=t.c+d[1];
            if(r>=0 && r<row && c>=0 && c<col && !visited[r][c] && mat[r][c]!=0){
                q.add(new Triplet(r,c,steps+1));
                visited[r][c]=true;
            }

        }
    }
    }
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        ans=new int[row][col];
        boolean [][]visited=new boolean[row][col];
        Queue<Triplet>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    q.add(new Triplet(i,j,0));
                    visited[i][j]=true;
                }
            }
        }
        bfs(q,visited,mat);
        return ans;
    }
}