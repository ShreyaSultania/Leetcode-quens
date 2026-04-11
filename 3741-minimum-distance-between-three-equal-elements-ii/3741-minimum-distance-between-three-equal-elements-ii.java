class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(int ele:map.keySet()){
            List<Integer>temp=map.get(ele);
            if(temp.size()>2){
                for(int i=0;i<temp.size()-2;i++){
                    int ans=2*(temp.get(i+2)-temp.get(i));
                    min=Math.min(min,ans);
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}