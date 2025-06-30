class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int max=arr[0];
        int total=0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int low=max;
        int high=total;
        int ans=0;
        
        while(low<=high){
            int s=0;
            int c=1;
            int mid=(low+high)/2;
            for(int i=0;i<arr.length;i++){
                if(s+arr[i]>mid) {
                c++;
                s=arr[i];
            }
            else{
                s=s+arr[i];
            }
            }
            
            if(c<=days){
                high=mid-1;
                ans=mid;
            }
            else low=mid+1;
        }
        return ans;
    }
}