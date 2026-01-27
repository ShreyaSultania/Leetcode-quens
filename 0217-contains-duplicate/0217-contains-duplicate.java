class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        // System.out.print(set.size());
        if(nums.length!=set.size()) return true;
        return false;
    }
}