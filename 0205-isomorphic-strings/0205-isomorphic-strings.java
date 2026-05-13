class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m=s.length();
        int n=t.length();
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(!map1.containsKey(ch)){
                map1.put(ch,ch1);
            }
            else{
                //check
                char ele=map1.get(ch);
                if(ele!=ch1) return false;
            }
            if(!map2.containsKey(ch1)){
                map2.put(ch1,ch);
            }
            else{
                //check
                char ele1=map2.get(ch1);
                if(ele1!=ch) return false;
            }
        }
        return true;
    }
}