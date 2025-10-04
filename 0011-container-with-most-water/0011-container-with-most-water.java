class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<=j){
        if(height[i]<height[j]){
         int area=height[i]*(j-i);
         maxArea=Math.max(area,maxArea);
         i++;
        }
        else if(height[i]>=height[j]){
        int area=height[j]*(j-i);
         maxArea=Math.max(area,maxArea);
         j--;
        }
        }
        return maxArea;
    }
}