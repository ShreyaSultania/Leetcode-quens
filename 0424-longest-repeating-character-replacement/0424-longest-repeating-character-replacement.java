class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int max=0;
        int i=0;
        int j=0;
        int n=s.length();
        int maxLength=0;
        while(j<n){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            int freq=map.get(ch);
            max=Math.max(freq,max);
            while(j-i+1-max>k){
                int frequency=map.get(s.charAt(i));
                map.put(s.charAt(i),frequency-1);
                i++;
            }
            maxLength=Math.max(maxLength,j-i+1);
            j++;
        }
        return maxLength;
    }
}