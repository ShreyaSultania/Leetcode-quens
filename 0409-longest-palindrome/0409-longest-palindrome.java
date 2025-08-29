class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
        }
        int sum=0;
        boolean odd=true;
        for(char ele:map.keySet()){
           if(map.get(ele)%2==0){
            sum=sum+map.get(ele);
           }
           else{
            odd=false;
           }
        }
        if(!odd) return sum+1;
        return sum;
    }
}