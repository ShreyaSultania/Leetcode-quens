class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>map1=new HashMap<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,ch1);
            }
            else{
                char ele=map.get(ch);
                if(ch1!=ele) return false;
            }
            if(!map1.containsKey(ch1)){
                map1.put(ch1,ch);
            }
            else{
                char ele=map1.get(ch1);
                if(ch!=ele) return false;
            }
        }
        return true;
    }
}