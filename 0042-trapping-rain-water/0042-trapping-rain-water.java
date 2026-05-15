class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int []nge=new int[n];
        int max=height[n-1];
        nge[n-1]=max;
        for(int i=n-2;i>=0;i--){
            max=Math.max(height[i+1],nge[i+1]);
            nge[i]=max;
        }
        int []pge=new int[n];
        max=height[0];
        pge[0]=max;
        for(int i=1;i<n;i++){
            max=Math.max(pge[i-1],height[i-1]);
            pge[i]=max;
        }
        int trap=0;
        for(int i=1;i<n-1;i++){
            int water=Math.min(pge[i],nge[i]);
            if(water-height[i]>0){
                trap+=water-height[i];
            }
        }
        return trap;
    }
}