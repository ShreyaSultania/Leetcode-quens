class Pair implements Comparable<Pair>{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        return p.freq-this.freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        for(char ele:map.keySet()){
            int freq=map.get(ele);
            pq.add(new Pair(ele,freq));
        }
        String ans="";
        while(pq.size()>0){
            Pair p=pq.remove();
            int freq=p.freq;
            for(int i=0;i<freq;i++){
                ans+=p.ch;
            }
        }
        return ans;
    }
}