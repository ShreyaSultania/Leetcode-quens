class Solution {
    public int findDuplicate(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            int cIndex=arr[i]-1;
            if(arr[i]!=arr[cIndex]){
                int temp=arr[i];
                arr[i]=arr[cIndex];
                arr[cIndex]=temp;
            }
            else i++;
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                return arr[j];
            }
        }
        return -1;
    }
}