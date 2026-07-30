class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
                while(map.containsKey(ch)){
                    map.remove(s.charAt(i));
                    i++;
                }
             map.put(ch,1);
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}