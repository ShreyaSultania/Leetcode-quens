class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
        }
        int ans[]=new int[2];
        int c=0;
        for(int ele:map.keySet()){
            if(map.get(ele)==2){
                ans[c]=ele;
                c++;
            }
        }
        return ans;
    }
}