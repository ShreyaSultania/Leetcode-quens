class Pair implements Comparable <Pair>{
    int val;
    int ones;
    Pair(int val,int ones){
        this.val=val;
        this.ones=ones;
    }
    public int compareTo(Pair p){
        if(p.ones!=this.ones){
            return this.ones-p.ones;
        }
        else{
            return this.val-p.val;
        }
    }
}
class Solution {
    public int[] sortByBits(int[] arr) {
        // System.out.print(Integer.bitCount(arr[0]));
        // return arr;
        int n=arr.length;
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(new Pair(arr[i],Integer.bitCount(arr[i])));
        }
        int idx=0;
        while(pq.size()>0){
            Pair p=pq.remove();
            arr[idx++]=p.val;
        }
        return arr;
    }
}