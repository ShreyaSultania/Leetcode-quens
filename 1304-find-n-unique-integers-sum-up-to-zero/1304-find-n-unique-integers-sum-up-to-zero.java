class Solution {
    public int[] sumZero(int n) {
       int arr[]=new int[n];
       int p=-(n/2);
       for(int i=0;i<n;i++){
        arr[i]=p;
        p++;
       }
       return arr;
    }
}