class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>map1=new HashMap<>();
        String []str=s.split(" ");
        if(str.length!=pattern.length()) return false;
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
            if(!map1.containsKey(str[i])){
                map1.put(str[i],ch);
            }
            else{
                if(ch!=(map1.get(str[i]))){
                    return false;
                }
            }
        }
      return true;
    }
}