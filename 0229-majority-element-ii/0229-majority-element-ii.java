class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int n=nums.length/3;
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
            int freq=map.get(ele);
            if(freq>n){
                ans.add(ele);
            }
        }
        return ans;
    }
}