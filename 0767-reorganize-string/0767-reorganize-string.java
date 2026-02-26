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
    public String reorganizeString(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ele=s.charAt(i);
            if(!map.containsKey(ele)) map.put(ele,1);
            else{
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
        }
        for(char ele:map.keySet()){
            int freq=map.get(ele);
            pq.add(new Pair(ele,freq));
        }
        String ans="";
        while(pq.size()>1){
            Pair p=pq.remove();
            ans+=p.ch;
            Pair p1=pq.remove();
             ans+=p1.ch;
             if(p.freq>1){
                pq.add(new Pair(p.ch,p.freq-1));
            }
            if(p1.freq>1){
                pq.add(new Pair(p1.ch,p1.freq-1));
            }
        }
        if(pq.size()==1){
            Pair p=pq.remove();
            ans+=p.ch;
            if(p.freq>1){
               return "";
            }
        }
        return ans;
    }
}