class Solution {
    int firstOccurence(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
     int lastOccurence(int[] nums, int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int n=nums.length;
        
        ans[0]=firstOccurence(nums,target);
        ans[1]=lastOccurence(nums,target);
        return ans;
    }
}