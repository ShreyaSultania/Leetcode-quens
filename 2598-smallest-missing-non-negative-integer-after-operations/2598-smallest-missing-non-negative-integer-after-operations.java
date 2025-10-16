class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=((nums[i]%value)+value)%value;
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                int freq=map.get(a);
                map.put(a,freq+1);
            }
        }
        int ans=0;
        while(true){
            if(!map.containsKey(ans%value)) break;
            else{
            int freq=map.get(ans%value);
            if(freq==0) break;
            map.put(ans%value,freq-1);
            ans++;
        }
        }
        return ans;
    }
}