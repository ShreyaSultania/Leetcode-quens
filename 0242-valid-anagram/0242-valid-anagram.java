class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch1=t.charAt(i);
            if(map.containsKey(ch1)){
                int freq=map.get(ch1);
                if(freq==0) return false;
               else map.put(ch1,freq-1);
            }
            else return false;
        }
        return true;
    }
}