class Pair implements Comparable<Pair>{
    int start;
    int finish;
    Pair(int start,int finish){
        this.start=start;
        this.finish=finish;
    }
    public int compareTo(Pair p){
        return this.finish-p.finish;
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {
       int n=pairs.length;
       ArrayList<Pair>arr=new ArrayList<>();
       for(int i=0;i<n;i++){
            int left=pairs[i][0];
            int right=pairs[i][1];
            arr.add(new Pair(left,right));
       }
       Collections.sort(arr);
       int c=1;
       Pair pt=arr.get(0);
       int initial_s=pt.start;
       int initial_f=pt.finish;
       for(int i=1;i<arr.size();i++){
            Pair p=arr.get(i);
            int st=p.start;
            int ft=p.finish;
            if(st>initial_f){
                c++;
                initial_f=ft;
            }
       }
       return c;
    }
}