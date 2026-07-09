class Solution {
    int firstOccurence(int []arr,int target){
        int low=0;
        int high=arr.length-1;
         int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
           else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    int lastOccurence(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
           else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=firstOccurence(nums,target);
        arr[1]=lastOccurence(nums,target);
        return arr;
    }
}