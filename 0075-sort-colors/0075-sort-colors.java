class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
         int low=0;
         int high=n-1;
         int mid=0;
         while(mid<=high){
            if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }

         }
    }
}