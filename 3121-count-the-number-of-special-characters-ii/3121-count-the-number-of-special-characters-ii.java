class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
            if(Character.isLowerCase(ch)){
                map.put(ch,i);
            }
            }
        }
        int c=0;
        for(char ele:map.keySet()){
            int idx=map.get(ele);
            if(Character.isLowerCase(ele)){
                if(map.containsKey(Character.toUpperCase(ele))){
                    int id=map.get(Character.toUpperCase(ele));
                    if(idx<id) c++;
                }
            }
        }
        return c;
    }
}