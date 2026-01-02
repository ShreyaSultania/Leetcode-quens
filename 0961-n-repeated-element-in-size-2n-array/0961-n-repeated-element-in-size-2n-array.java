class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        for(int ele:map.keySet()){
            if(map.get(ele)==n) return ele;
        }
        return -1;
    }
}