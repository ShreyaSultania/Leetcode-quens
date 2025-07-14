class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jump=0;
        int farthest=0;
        int stop=0;
        for(int i=0;i<n-1;i++){
           farthest=Math.max(nums[i]+i,farthest);
           if(i==stop){
            jump++;
            stop=farthest;
           }
        }
        return jump;
        
    }
}