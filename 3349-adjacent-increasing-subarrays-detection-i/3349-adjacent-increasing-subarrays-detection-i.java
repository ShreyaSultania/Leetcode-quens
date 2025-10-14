class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int i=0;
        int j=i+k;
        int n=nums.size();
        while(j+k-1<n){
            boolean flag=true;
            boolean flag1=true;
           for(int p=i;p<i+k-1;p++){
            if(nums.get(p)>=nums.get(p+1)){
                flag=false;
                break;
            }
           }
           for(int m=j;m<j+k-1;m++){
             if(nums.get(m)>=nums.get(m+1)){
                flag1=false;
                break;
           }
           }
        i++;
        j++;
        if(flag&& flag1) return true;
        }
        return false;
    }
}