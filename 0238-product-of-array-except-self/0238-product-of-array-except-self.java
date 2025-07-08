class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int brr[]=new int[n];
        
        for(int i=0;i<n;i++){
           int p=1;
           for(int j=0;j<n;j++){
            if(i!=j){
                p=p*arr[j];
            }
            brr[i]=p;
           }
        }
        return brr;
    }
}