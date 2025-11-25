class Solution {
    public int minMoves(int[] nums) {
       int n=nums.length;
       int moves=0;
       int min=Integer.MAX_VALUE;
       for(int ele:nums){
        min=Math.min(min,ele);
       }
       for(int ele:nums){
        moves+=(ele-min);
       }
       return moves;
    }
}