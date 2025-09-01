class Solution {
    class Triplet implements Comparable<Triplet>{
        int a;
        int b;
        double c;
        Triplet(int a,int b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        @Override
        public int compareTo(Triplet t){
            return Double.compare(this.c,t.c);
        }
    }
    public double maxAverageRatio(int[][] matrix, int extraStudents) {
        int row=matrix.length;
        int max=Integer.MIN_VALUE;
        PriorityQueue<Triplet>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<row;i++){
            int pass=matrix[i][0];
            int total=matrix[i][1];
            double gain=((double)(pass+1) / (total+1)-(double) pass/total);
            pq.offer(new Triplet(pass,total,gain));
        }
       for(int i=1;i<=extraStudents;i++){
            Triplet t=pq.poll();
           int p= t.a+1;
           int to=t.b+1;
           double g=((double) (p+1)/(to+1)-(double)p / to);
           pq.offer(new Triplet(p,to,g));
       }
       double sum=0;
       while(!pq.isEmpty()){
        Triplet t=pq.poll();
        int pas=t.a;
        int tot=t.b;
        sum=sum+((double) pas/tot);
       }
       return (double)sum/row;
    }
}