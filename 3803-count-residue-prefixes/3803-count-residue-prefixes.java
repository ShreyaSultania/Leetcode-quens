class Solution {
    public int residuePrefixes(String s) {
        String ans="";
        int c=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.add(ch);
            ans+=ch;
            if(ans.length()%3==set.size()) c++;
        }
        
        // else return set.size()-1%3;
        return c;
        // return 0;
    }
}