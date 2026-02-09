class Pair implements Comparable<Pair>{
    String name;
    int height;
    Pair(String name,int height){
        this.name=name;
        this.height=height;
    }
    public int compareTo(Pair p){
        return p.height-this.height;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Pair []temp=new Pair[heights.length];
        for(int i=0;i<heights.length;i++){
            temp[i]=new Pair(names[i],heights[i]);
        }
        Arrays.sort(temp);
        String ans[]=new String[heights.length];
        for(int i=0;i<heights.length;i++){
            ans[i]=temp[i].name;
        }
        return ans;
    }
}