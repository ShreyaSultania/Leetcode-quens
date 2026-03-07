class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int k=s1.length();
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
       }
       int c=s1.length();
       int i=0;
       int j=0;
       while(j<s2.length()){
         char ch=s2.charAt(j);
         if(map.containsKey(ch)){
            int freq=map.get(ch);
            if(freq>0) c--;
            map.put(ch,freq-1);
         }
         while(j-i+1>k){
            if(map.containsKey(s2.charAt(i))){
               int freq=map.get(s2.charAt(i));
               map.put(s2.charAt(i),freq+1);
               if(freq+1>0) c++;
            }
            i++;
         }
         if(c==0) return true;
         j++;
       }
       return false;
    }
}