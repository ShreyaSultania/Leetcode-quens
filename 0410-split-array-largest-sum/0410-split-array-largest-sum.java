class Solution {
    public int splitArray(int[] nums, int k) {
        int total=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(max<nums[i]) max=nums[i];
        }
        int low=max;
        int high=total;
        while(low<=high){
            int mid=(low+high)/2;
            int split=1;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>mid){
                    split++;
                    sum=nums[i];
                }
            }
            if(split<=k) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}