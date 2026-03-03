class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        int length=0;
        while(i<j){
            if(height[i]<height[j]){
                length=height[i];
                int area=length*(j-i);
                maxArea=Math.max(maxArea,area);
                i++;
            }
            else if(height[i]>=height[j]){
                length=height[j];
                int area=length*(j-i);
                maxArea=Math.max(maxArea,area);
                j--;
            }
        }
        return maxArea;
    }
}