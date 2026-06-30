class Pair implements Comparable<Pair>{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        if(p.freq==this.freq){
            return this.ch-p.ch;
        }
        else{
            return p.freq-this.freq;
        }
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        HashMap<Character,Integer>map=new HashMap<>();
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
            int freq=map.get(ch);
            pq.add(new Pair(ch,freq));
        }
        String ans="";
        while(pq.size()>0){
            Pair p=pq.remove();
            int f=p.freq;
            char c=p.ch;
            for(int i=0;i<f;i++){
                ans+=c;
            }
        }
        return ans;
    }
}