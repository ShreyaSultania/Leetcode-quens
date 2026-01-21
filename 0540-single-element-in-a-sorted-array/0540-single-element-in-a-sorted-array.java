class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
         if(n==1) return nums[0];
         if(nums[0]!=nums[1]) return nums[0];
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1] ) return nums[mid];
            if(mid%2!=0 && nums[mid]==nums[mid-1]) low=mid+1;
            else if(mid%2!=0 && nums[mid]==nums[mid+1]) high=mid;
            else if(mid%2==0 && nums[mid]==nums[mid+1]) low=mid+1;
            else if(mid%2==0 && nums[mid]==nums[mid-1]) high=mid;
        }
        return nums[low];
    }
}