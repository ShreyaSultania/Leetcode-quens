class Pair implements Comparable <Pair>{
    char val;
    int freq;
    Pair(char val,int freq){
        this.val=val;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        return p.freq-this.freq;
    }
}
class Solution {
    public String reorganizeString(String s) {
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
       PriorityQueue<Pair>pq=new PriorityQueue<>();
       int maxFreq=0;
       int n=s.length();
       for(char ele:map.keySet()){
        int freq=map.get(ele);
        pq.add(new Pair(ele,freq));
        maxFreq=Math.max(maxFreq,freq);
       }
       if(maxFreq>(n+1)/2) return "";
       StringBuilder ans=new StringBuilder("");
       while(pq.size()>1){
        Pair p=pq.remove();
        ans.append(p.val);
        Pair p1=pq.remove();
        ans.append(p1.val);
        if(p.freq>1) pq.add(new Pair(p.val,p.freq-1));
        if(p1.freq>1) pq.add(new Pair(p1.val,p1.freq-1));
       }
       if(pq.size()>0){
        Pair p=pq.remove();
        ans.append(p.val);
       }
       return ans.toString();


    }
}