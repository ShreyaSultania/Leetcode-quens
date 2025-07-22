class Solution {
    public int subarraySum(int[] nums, int k) {
    //     int c=0;
    //    for(int i=0;i<nums.length;i++){
    //     int sum=0;
    //     for(int j=i;j<nums.length;j++){
    //        sum=sum+nums[j];
    //        if(sum==k) {
    //         c++;
    //        }
    //     }
    //    }
    //    return c;

    // OPTIMISED CODE
    int n=nums.length;
    int arr[]=new int[n];
    arr[0]=nums[0];
    for(int i=1;i<n;i++){
        arr[i]=arr[i-1]+nums[i];
    }
    int c=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0,1);
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            int freq=map.get(arr[i]);
            map.put(arr[i],freq+1);
        }
        else map.put(arr[i],1);
    }
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i]-k)){
           int freq= map.get(arr[i]-k);
           c=c+freq;
        }
    }
    return c;
    }
}