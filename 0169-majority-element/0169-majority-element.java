class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i],1);
        }
        else{
            int freq=map.get(nums[i]);
            map.put(nums[i],freq+1);
        }
       }
       for(int key:map.keySet()){
        int f=map.get(key);
        if(f>(n/2)){
            return key;
        }
       }
       return -1;
    }
}