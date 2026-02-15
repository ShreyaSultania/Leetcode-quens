class Solution {
    public String addBinary(String a, String b) {
        int m=a.length();
        int n=b.length();
        int i=m-1;
        int j=n-1;
        StringBuilder ans=new StringBuilder("");
        int carry=0;
        while(i>=0 || j>=0){
            int ch=0;
            int ch1=0;
            if(i>=0){
                ch=a.charAt(i)-'0';
            }
            if(j>=0){
                ch1=b.charAt(j)-'0';
            }
            int val=ch+ch1+carry;
            if(val>1){
                ans.append(0);
                carry=1;
            }
            else{
                ans.append(val);
            }
            i--;
            j--;
        }
        if(carry>0){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}