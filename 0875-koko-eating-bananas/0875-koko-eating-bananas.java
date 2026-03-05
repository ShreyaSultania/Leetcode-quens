class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int low=1;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int hours=0;
            for(int i=0;i<piles.length;i++){
                hours+=Math.ceil((double)piles[i]/mid);
            }
            if(hours>h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}