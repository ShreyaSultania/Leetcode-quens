class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int max=0;
        int j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                while(map.containsKey(ch)){
                    map.remove(s.charAt(i));
                    i++;
                }
                map.put(ch,1);
            }
            j++;
            max=Math.max(max,j-i);
        }
        return max;
    }
}