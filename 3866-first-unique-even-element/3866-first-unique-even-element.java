class Solution {
    public int firstUniqueEven(int[] nums) {
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],1);
                }
                else{
                    int freq=map.get(nums[i]);
                    map.put(nums[i],freq+1);
                }
            }
        }
        for(int ele:map.keySet()){
            int f=map.get(ele);
            if(f==1) return ele;
        }
        return -1;
    }
}