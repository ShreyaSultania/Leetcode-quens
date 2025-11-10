class Solution {
    public int majorityElement(int[] arr) {
        int size=arr.length;
        int lead=0;
        int n=0;
        for(int i=0;i<size;i++){
         if(lead==0){
            n=arr[i];
         }
         if(n==arr[i]) lead++;
         else lead--;
        }
        return n;
    }
}