class Pair implements Comparable<Pair>{
    int plant;
    int grow;
    Pair(int plant,int grow){
        this.plant=plant;
        this.grow=grow;
    }
    public int compareTo(Pair p){
        return p.grow-this.grow;
    }
}
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        ArrayList<Pair>arr=new ArrayList<>();
        int n=growTime.length;
        for(int i=0;i<n;i++){
            arr.add(new Pair(plantTime[i],growTime[i]));
        }
        Collections.sort(arr);
        int prev=0;
        int totalDay=0;
        for(int i=0;i<n;i++){
            Pair p=arr.get(i);
            totalDay=Math.max(totalDay,(prev+p.plant+p.grow));
            prev+=p.plant;
        }
        return totalDay;
    }
}