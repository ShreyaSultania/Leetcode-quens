class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength=0;
         for(int ele:set){
           if(set.contains(ele+1)){
             int curr=ele;
              int length=1;
            while(set.contains(curr+1)){
                curr=curr+1;
                length++;
            }
            maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}