class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            max=Math.max(max,nums[i]);
        }
        for(int i=1;i<=max;i++){
            if(map.containsKey(i)){
            int freq=map.get(i);
            if(i!=max && freq!=1) return false;
            else if(i==max && freq!=2) return false;
            }
            else return false;
        }
        return true;
    }
}