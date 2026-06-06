class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []left=new int[n];
        int []right=new int[n];
        int []diff=new int[n];
        int l=0;
        int r=0;
        for(int i=1;i<n;i++){
            l=l+nums[i-1];
            left[i]=l;
        }
        for(int i=n-2;i>=0;i--){
            r=r+nums[i+1];
            right[i]=r;
        }
        for(int i=0;i<n;i++){
            // System.out.print(right[i]+" ");
            diff[i]=Math.abs(left[i]-right[i]);
        }
        return diff;
    }
}