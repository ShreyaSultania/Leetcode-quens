class Triplet implements Comparable <Triplet>{
    int x;
    int y;
    double dis;
    Triplet(int x,int y,double dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
    }
    public int compareTo(Triplet t){
        return Double.compare(t.dis,this.dis);
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            double dis=Math.sqrt(x*x+y*y);
            pq.add(new Triplet(x,y,dis));
            if(pq.size()>k) pq.remove();
        }
        int [][]arr=new int[pq.size()][2];
        int idx=0;
        while(pq.size()>0){
            Triplet t=pq.remove();
            int x=t.x;
            int y=t.y;
            arr[idx][0]=x;
            arr[idx][1]=y;
            idx++;
        }
        return arr;
    }
}