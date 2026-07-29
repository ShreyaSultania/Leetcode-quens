class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int max=0;
        for(int a:set){
            if(!set.contains(a-1)){
                int c=0;
                int ele=a;
                while(set.contains(ele)){
                    c++;
                    max=Math.max(max,c);
                    ele=ele+1;
                }
            }
        }
        return max;
    }
}