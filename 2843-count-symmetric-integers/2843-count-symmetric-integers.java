class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int len=s.length();
            if(len%2==0){
            int sum=0;
            int sum1=0;
            for(int j=0;j<(len)/2;j++){
                sum+=s.charAt(j)-'0';
            }
             for(int k=len/2;k<len;k++){
                sum1+=s.charAt(k)-'0';
            }
            if(sum1==sum) c++;
        }
        }
        return c;
    }
}