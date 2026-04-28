class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int[]arr=new int[n+n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[n+i]=nums[i];
        }
        int max=0;
        int i=0;
        int j=0;
        while(j<2*n-1){
            if(arr[j]<=arr[j+1]){
                max=Math.max(max,j-i+1);
            }
            else{
                i=j;
            }
            j++;
        }
        if(max==n) return true;
        return false;
    }
}