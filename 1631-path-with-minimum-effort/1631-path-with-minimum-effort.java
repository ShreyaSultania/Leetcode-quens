class Triplet implements Comparable <Triplet>{
    int row;
    int col;
    int dist;
    Triplet(int row,int col,int dist){
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
    public int compareTo(Triplet t){
        return this.dist-t.dist;
    }
    }
class Solution {
    public int minimumEffortPath(int[][] height) {
        int m=height.length;
        int n=height[0].length;
        int effort[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) effort[i][j]=0;
                else  effort[i][j]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));
        while(!pq.isEmpty()){
            Triplet t=pq.remove();
            int currrow=t.row;
            int currcol=t.col;
            int currDis=t.dist;

            if (currrow == m - 1 && currcol == n - 1) {
                return currDis;
            }
            // top
            if(currrow-1>=0){
                int dist=Math.abs(height[currrow][currcol]-height[currrow-1][currcol]);
                    int distance=Math.max(dist,currDis);
                    if(effort[currrow-1][currcol]>distance){
                    effort[currrow-1][currcol]=distance;
                    pq.add(new Triplet(currrow-1,currcol,distance));
                }
            }
            // down
             if(currrow+1<m){
                int dist=Math.abs(height[currrow][currcol]-height[currrow+1][currcol]);
                    int distance=Math.max(dist,currDis);
                    if(effort[currrow+1][currcol]>distance){
                    effort[currrow+1][currcol]=distance;
                    pq.add(new Triplet(currrow+1,currcol,distance));
                }
            }
            // left
             if(currcol-1>=0){
                int dist=Math.abs(height[currrow][currcol]-height[currrow][currcol-1]);
                    int distance=Math.max(dist,currDis);
                     if(effort[currrow][currcol-1]>distance){
                    effort[currrow][currcol-1]=distance;
                    pq.add(new Triplet(currrow,currcol-1,distance));
                }
            }
            // right
           if(currcol+1<n){
                int dist=Math.abs(height[currrow][currcol]-height[currrow][currcol+1]);
                
                    int distance=Math.max(dist,currDis);
                    if(effort[currrow][currcol+1]>distance){
                    effort[currrow][currcol+1]=distance;
                    pq.add(new Triplet(currrow,currcol+1,distance));
                }
            }

        }
        return -1;
    }
}