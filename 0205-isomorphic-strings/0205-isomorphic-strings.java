class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,ch1);
            }
            else{
                char f=map.get(ch);
                if(f!=ch1) return false;
            }
        }
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            char ch1=s.charAt(i);
            if(!map1.containsKey(ch)){
                map1.put(ch,ch1);
            }
            else{
                char f=map1.get(ch);
                if(f!=ch1) return false;
            }
        }
        return true;
    }
}