class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        for(int i=0;i<m;i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)) return false;
            else{
                int freq=map.get(ch);
                if(freq==1) map.remove(ch);
                else map.put(ch,freq-1);
            }
        }
        return true;
    }
}