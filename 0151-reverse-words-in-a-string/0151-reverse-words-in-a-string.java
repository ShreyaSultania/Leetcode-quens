class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        int i=0;
        int j=arr.length-1;
        while(i<j){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String sb="";
        for(int k=0;k<arr.length;k++){
            if(k!=arr.length-1)sb+=arr[k]+" ";
            else{
                sb+=arr[k];
            }
        }
        return sb;
    }
}