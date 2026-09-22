class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            max=Math.max(nums[i],max);
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)) return i;
        }
        if(max<=0) return 1;
        return max+1;
    }
}