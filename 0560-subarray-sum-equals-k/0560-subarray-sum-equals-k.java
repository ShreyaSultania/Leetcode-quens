class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        // map.put(0,1);
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(sum)) map.put(sum,1);
            else map.put(sum,map.get(sum)+1);
             sum+=nums[i];
            if(map.containsKey(sum-k)) c+=map.get(sum-k);
            }
        
        return c;
    }
}