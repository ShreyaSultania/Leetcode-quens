class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int i=0;
        int j=0;
        int maxlen=0;
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i) {
                int len=j-i;
                maxlen=Math.max(maxlen,len);
                while(ch!=s.charAt(i)) i++;
                i++;
                
            }
            map.put(ch,j);
            j++;
        }
        int len=j-i;
         maxlen=Math.max(maxlen,len);
        return maxlen;
    }
}