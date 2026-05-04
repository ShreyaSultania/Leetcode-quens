class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int n=nums.length;
        int maxc=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int c=1;
                int ele1=ele;
                while(set.contains(ele1+1)){
                    ele1++;
                    c++;
                }
                  maxc=Math.max(c,maxc);
            }

        }
        return maxc;
    }
}