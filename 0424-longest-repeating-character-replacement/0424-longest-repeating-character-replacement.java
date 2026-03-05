class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int n=s.length();
        int max=0;
        int maxLength=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
                max=1;
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
                max=Math.max(max,freq+1);
            }
            while(j-i+1-max>k){
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq-1);
                max=Math.max(max,freq-1);
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}