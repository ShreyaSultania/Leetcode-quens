class Solution {
    public int maxFrequencyElements(int[] nums) {
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
        int max=Integer.MIN_VALUE;
        for(int key:map.keySet()){
            int val=map.get(key);
            if(val>max){
                max=val;
            }
        }
        int c=0;
        for(int key:map.keySet()){
            int val=map.get(key);
            if(val==max) c+=val;
        }
        return c;
    }
}