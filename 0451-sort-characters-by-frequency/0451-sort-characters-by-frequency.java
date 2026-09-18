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
        ArrayList<Pair>arr=new ArrayList<>();
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            arr.add(new Pair(ch,freq));
        }
        Collections.sort(arr);
        String ans="";
        for(int i=0;i<arr.size();i++){
            Pair p=arr.get(i);
            for(int j=0;j<p.freq;j++){
                ans+=p.ch;
            }
        }
        return ans;
    }
}