class Solution {
    public int maxDistance(int[] nums, int m) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
        }
        int low=1;
        int high=max-min;
        Arrays.sort(nums);
        while(low<=high){
            int c=1;
            int mid=(low+high)/2;
            int lastPos=nums[0];
            for(int i=1;i<nums.length;i++){
            if(lastPos+mid<=nums[i]){
                c++;
                lastPos=nums[i];
            }
            }
            if(c<m) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}