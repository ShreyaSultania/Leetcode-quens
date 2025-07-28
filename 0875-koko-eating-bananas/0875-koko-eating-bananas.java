class Solution {
    public int minEatingSpeed(int[] arr, int days) {
       
        long low=1;
        long high=(long)1e9;
        long ans=0;
        
        while(low<=high){
            long s=0;
            long mid=(low+high)/2;
            for(int i=0;i<arr.length;i++){
                s=s+(arr[i]+mid-1)/mid;
            }
            
            if(s<=days){
                high=mid-1;
                ans=mid;
            }
            else low=mid+1;
        }
        return (int)ans;
    }
}
  