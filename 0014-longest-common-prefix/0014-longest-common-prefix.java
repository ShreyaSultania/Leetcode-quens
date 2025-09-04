class Solution {
    public String longestCommonPrefix(String[] str) {
        String s="";
        int c=0;
        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else break;
        }
        s=s1.substring(0,i);
        return s;
        }
}