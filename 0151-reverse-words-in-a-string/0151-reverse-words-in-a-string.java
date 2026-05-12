class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[]str=s.split("\\s+");
        int n=str.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return String.join(" ",str);
    }
}