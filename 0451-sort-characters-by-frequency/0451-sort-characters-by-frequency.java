class Pair implements Comparable <Pair>{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        if(p.freq==this.freq){
            return p.ch-this.ch;
        }
        else return p.freq-this.freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }

        for(char ch:map.keySet()){
            pq.add(new Pair(ch,map.get(ch)));
        }
        String ans="";
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            char ch=p.ch;
            int freq=p.freq;
            for(int i=0;i<freq;i++){
                ans+=ch;
            }
        }
        return ans;
    }
}