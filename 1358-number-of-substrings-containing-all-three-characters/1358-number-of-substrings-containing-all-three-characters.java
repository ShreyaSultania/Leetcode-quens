class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int c=0;
        int i=0;
        int j=0;
            while(j<n){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            while(map.size()==3){
                int freq=map.get(s.charAt(i));
                if(freq==1) map.remove(s.charAt(i));
                else map.put(s.charAt(i),freq-1);
                i++;
            }
            c+=i;
            j++;

        }
        return c;
    }
}