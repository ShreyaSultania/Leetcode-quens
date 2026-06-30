class Pair implements Comparable<Pair>{
    String str;
    int freq;
    Pair(String str,int freq){
        this.str=str;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        if(this.freq==p.freq){
            //jo string phle aayegi
            return this.str.compareTo(p.str);
        }
        else{
            return p.freq-this.freq;
        }
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>ans=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                int freq=map.get(s);
                map.put(s,freq+1);
            }
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(String s:map.keySet()){
            int freq=map.get(s);
            pq.add(new Pair(s,freq));
        }
        while(k-->0){
            Pair p=pq.remove();
            ans.add(p.str);
            
        }
        return ans;
    }
}