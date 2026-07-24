class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int max=0;
         HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        if(max==0) return 1;
        for(int i=1;i<=max;i++){
            if(!set.contains(i)) return i;
        }
        return max+1;
    }

}