class Solution {
    public int minimumOperations(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]%3!=0){
                if((arr[i]+1)%3==0) c++;
                else if((arr[i]-1)%3==0) c++;
            }
        }
        return c;
    }
}