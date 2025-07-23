class Solution {
    public class doublet implements Comparable<doublet>{
        char ele;
        int frequency;
        doublet(char ele,int frequency){
            this.ele=ele;
            this.frequency=frequency;
        }
        public int compareTo(doublet t){
            if(this.frequency==t.frequency){
                return this.ele-t.ele;
            }
            else{
                return t.frequency-this.frequency;
            }
        }
    }
    public String frequencySort(String s) {
      int n=s.length();
      String ans="";
      HashMap<Character,Integer>map=new HashMap<>();
      PriorityQueue<doublet>pq=new PriorityQueue<>();
      for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            int freq=map.get(ch);
            map.put(ch,freq+1);
        }
        else{
            map.put(ch,1);
        }
      }
      for(char ele:map.keySet()){
        pq.add(new doublet(ele,map.get(ele)));
      }
      while(pq.size()!=0){
        doublet d=pq.poll();
        for(int i=0;i<d.frequency;i++){
            ans=ans+d.ele;
        }
      }
      return ans;
    }
}