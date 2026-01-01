class Solution {
    public int[] plusOne(int[] arr) {
        int n=arr.length;
         int brr[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;   
        }
        brr[0]=1;
         return brr;
    }
}