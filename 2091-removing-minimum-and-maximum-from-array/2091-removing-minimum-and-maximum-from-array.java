class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int idxmin=-1;
        int max=Integer.MIN_VALUE;
        int idxmax=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                idxmax=i;
            }
            if(nums[i]<min){
                min=nums[i];
                idxmin=i;
            }
        }
        // front
        int front=Math.max(idxmin,idxmax)+1;
        // back
        int back=n-Math.min(idxmin,idxmax);
        // front+back
        int pF=Math.min(idxmin,idxmax)+1;
        int qB=n-Math.max(idxmax,idxmin);
        int k=pF+qB;
        return Math.min(back,Math.min(front,k));
    }
}