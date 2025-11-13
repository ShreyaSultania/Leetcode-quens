class Solution {
    public int longestConsecutive(int[] nums) {
             HashSet<Integer>set=new HashSet<>();
             int n=nums.length;
             if(n==0) return 0;
             for(int i=0;i<n;i++){
                set.add(nums[i]);
             }
             int len=0;
             for(int ele : set){
                if(!set.contains(ele-1)){
                    int current=ele;
                    int c=1;
                    while(set.contains(ele+1)){
                        c++;
                        ele=ele+1;
                    }
                    len=Math.max(len,c);
                }
             }
             return len;
    }
}