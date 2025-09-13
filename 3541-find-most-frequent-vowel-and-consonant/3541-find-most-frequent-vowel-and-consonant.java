class Solution {
    public int maxFreqSum(String s) {
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
        int maxV=0;
        int maxC=0;
        for(char ch: map.keySet()){
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
            int freq=map.get(ch);
            maxV=Math.max(maxV,freq);
            }
            else{
                 int freq=map.get(ch);
                 maxC=Math.max(maxC,freq);
            }
        }
        return maxV+maxC;
    }
}