class Solution {
    public String largestOddNumber(String num) {
        int n=Integer.valueOf(num);
        int max=Integer.MIN_VALUE;
        if(n%2!=0) return num;
        for(int i=1;i<num.length();i++){
            String s=num.substring(0,i);
            int ans=Integer.valueOf(s);
            if(ans%2!=0){
                max=Math.max(max,ans);
            }
        }
        if(max==Integer.MIN_VALUE) return "";
        return String.valueOf(max);
    }
}