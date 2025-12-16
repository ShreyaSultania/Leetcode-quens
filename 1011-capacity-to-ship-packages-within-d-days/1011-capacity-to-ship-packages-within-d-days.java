class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            if(max<weights[i]) max=weights[i];
            total+=weights[i];
        }
        int low=max;
        int high=total;
        
        while(low<=high){
             int sum=0;
             int Sumdays=1;
            int mid=(low+high)/2;
            for(int i=0;i<weights.length;i++){
                if(sum+weights[i]>mid){
                    Sumdays++;
                    sum=weights[i];
                }
                else{
                    sum+=weights[i];
                }
            }
            if(Sumdays>days) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}