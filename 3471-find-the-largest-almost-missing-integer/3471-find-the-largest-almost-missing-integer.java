class Solution {
    public int largestInteger(int[] nums, int k) {
        int max=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                if(!map.containsKey(nums[j])){
                    map.put(nums[j],1);
                }
                else{
                    int freq=map.get(nums[j]);
                    map.put(nums[j],freq+1);
                }
            }
        }

        for(int key:map.keySet()){
            int freq=map.get(key);
            // System.out.println(key);
            if(freq==1 && max<key){
                max=key;
            }
            if(n==k && max<key){
                max=key;
            }
        }
        if(n==k && map.get(nums[0])==n) return nums[0];
        return max;
    }
}