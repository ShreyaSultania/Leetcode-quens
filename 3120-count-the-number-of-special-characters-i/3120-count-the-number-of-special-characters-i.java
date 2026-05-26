class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>set=new HashSet<>();
        int c=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            set.add(ch);
        }
        for(char ch:set){
            if(Character.isLowerCase(ch)){
                if(set.contains(Character.toUpperCase(ch))){
                    c++;
                }
            }
        }
        return c;
    }
}