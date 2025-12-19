class Solution {
    public boolean isAnagram(String s, String t) {
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
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                if(freq==1) map.remove(ch);
                else map.put(ch,freq-1);
            }
           
        }
        if(map.size()==0) return true;
        return false;
    }
}