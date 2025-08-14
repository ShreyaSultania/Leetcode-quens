class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        int arr[]=new int[num.length()];
        for(int k=0;k<arr.length;k++){
            arr[k]=num.charAt(k)-'0';
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]){
                String str=num.substring(i,i+3);
                if(s.equals("") || str.compareTo(s)>0){
                    s=str;
                }
            }
        }
        return s;
    }
}