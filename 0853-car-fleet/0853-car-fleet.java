class Pair implements Comparable<Pair>{
    int dis;
    double time;
    Pair(int dis,double time){
        this.dis=dis;
        this.time=time;
    }
    public int compareTo(Pair p){
        return this.dis-p.dis;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        Pair []arr=new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(position[i],((double)target-position[i])/(double)speed[i]);
        }
        Arrays.sort(arr);
        int fleet=0;
        double maxTime=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i].time>maxTime){
            fleet++;
            maxTime=arr[i].time;
        }
        }
        return fleet;
    }
}