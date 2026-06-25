class Solution {
    public boolean detectCapitalUse(String word) {
        int capital=0;
        int small=0;
        int n=word.length();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            //all capital
           if(Character.isUpperCase(ch)){
                capital++;
           }
           else if(Character.isLowerCase(ch)){
            small++;
           }
        }
         boolean s=Character.isUpperCase(word.charAt(0));
        if(capital==n) return true;
        else if(small==n) return true;
        else if(s && small==n-1) return true;
        return false;
    }
}