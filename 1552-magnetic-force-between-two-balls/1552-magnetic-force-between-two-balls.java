class Solution {
    public int maxDistance(int[] nums, int m) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int low=1;
        int high=max-min;
        Arrays.sort(nums);
        while(low<=high){
            int mid=(low+high)/2;
            int ball=1;
            int pos=nums[0];
            for(int i=1;i<n;i++){
                if(pos+mid<=nums[i]){
                    ball++;
                    pos=nums[i];
                }
            }
             if(ball>=m){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}