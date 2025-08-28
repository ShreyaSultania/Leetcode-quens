class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        String []str=s.split(" ");
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,str[i]);
            }
            else{
                if(!str[i].equals(map.get(ch))){
                    return false;
                }
            }
        }
   return true;
    }
}