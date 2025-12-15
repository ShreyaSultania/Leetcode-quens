class Solution {
    public int minDays(int[] bloom, int m, int k) {
        if((long)m*k>bloom.length) return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloom.length;i++){
            if(bloom[i]>max) max=bloom[i];
            if(bloom[i]<min) min=bloom[i];
        }
        int low=min;
        int high=max;
        // int ans=-1;
        while(low<=high){
            int c=0;
            int adj=0;
            int mid=(low+high)/2;
            for(int i=0;i<bloom.length;i++){
               if(bloom[i]<=mid){
                    adj++;
                    if(adj==k){
                        c++;
                        adj=0;
                    }
               }
               else adj=0;
            }
            if(c<m) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}