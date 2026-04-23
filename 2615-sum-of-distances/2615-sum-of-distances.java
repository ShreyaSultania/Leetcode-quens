class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long left[]=new long[n]; //left
        long arr[]=new long[n];
        HashMap<Integer,Long>mapfreq=new HashMap<>();
        HashMap<Integer,Long>mapSum=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mapfreq.containsKey(nums[i])){
                mapfreq.put(nums[i],(long)1);
                mapSum.put(nums[i],(long)i);
            }
            else{
                left[i]=(mapfreq.get(nums[i])*i)-(mapSum.get(nums[i]));
                long freq=mapfreq.get(nums[i]);
                mapfreq.put(nums[i],freq+1);
                long idx=mapSum.get(nums[i]);
                mapSum.put(nums[i],i+idx);
                
            }
           
        }
        mapfreq=new HashMap<>();
        mapSum=new HashMap<>();
        long[] right=new long[n];
        for(int i=n-1;i>=0;i--){
            if(!mapfreq.containsKey(nums[i])){
                mapfreq.put(nums[i],(long)1);
                mapSum.put(nums[i],(long)i);
            }
            else{
                right[i]=(mapSum.get(nums[i]))-(mapfreq.get(nums[i])*i);
                long freq=mapfreq.get(nums[i]);
                mapfreq.put(nums[i],freq+1);
                long idx=mapSum.get(nums[i]);
                mapSum.put(nums[i],i+idx);
                
            }
            
        }
        for(int i=0;i<n;i++){
            arr[i]=(left[i]+right[i]);
        }
        return arr;
    }
}