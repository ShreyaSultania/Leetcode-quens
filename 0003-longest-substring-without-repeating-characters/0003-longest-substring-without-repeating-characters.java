class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int maxLen=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                while(map.containsKey(ch)){
                    int freq=map.get(s.charAt(i));
                    if(freq==1) map.remove(s.charAt(i));
                    else map.put(s.charAt(i),freq-1);
                    i++;
                }
                map.put(ch,1);
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}