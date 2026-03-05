class Solution {
    public int minOperations(String s) {
        int c=0;
        int minC=Integer.MAX_VALUE;
        StringBuilder sb=new StringBuilder(s);
        if(sb.charAt(0)!='1') c++;
        sb.setCharAt(0,'1');
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                if(sb.charAt(i-1)=='0'){
                    sb.setCharAt(i,'1');
                }
                else{
                    sb.setCharAt(i,'0');
                }
                c++;
            } 
        }
        minC=Math.min(minC,c);
          int c1=0;
        StringBuilder sb1=new StringBuilder(s);
        if(sb1.charAt(0)!='0') c1++;
        sb1.setCharAt(0,'0');
        for(int i=1;i<sb1.length();i++){
            if(sb1.charAt(i)==sb1.charAt(i-1)){
                if(sb1.charAt(i-1)=='0'){
                    sb1.setCharAt(i,'1');
                }
                else{
                    sb1.setCharAt(i,'0');
                }
                c1++;
            } 
    }
     minC=Math.min(minC,c1);
     return minC;
    }
}