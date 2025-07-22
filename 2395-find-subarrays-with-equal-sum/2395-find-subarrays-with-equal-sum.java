class Solution {
    public boolean findSubarrays(int[] nums) {
       TreeSet<Integer>set=new TreeSet<>();
       for(int i=0;i<nums.length-1;i++){
          int sum=nums[i]+nums[i+1];
           if(set.contains(sum)){
            return true;
          }
          else{
            set.add(sum);
          }
       }
     return false;
    }
}