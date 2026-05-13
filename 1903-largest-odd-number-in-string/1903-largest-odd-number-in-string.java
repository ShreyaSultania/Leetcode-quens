class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            int k=num.charAt(i)-'0';
            // System.out.print(k);
            if(k%2!=0){
                return num.substring(0,i+1);
            }
        }
        return ans;
    }
}