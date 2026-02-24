class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                i++;
                j--;
            }
            else{
                int min=Math.min(sb.charAt(i),sb.charAt(j));
                char minC=(char)min;
                System.out.print(minC);
                if(sb.charAt(i)==min){
                    sb.setCharAt(j,minC);
                }
                else{
                    sb.setCharAt(i,minC);
                }
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}