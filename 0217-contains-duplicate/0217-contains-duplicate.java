class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>s=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        //duplicates
        if(n!=s.size()) return true;
        return false;
    }
}