class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int length=Math.min(arr[i],arr[j]);
            int breadth=j-i;
            max=Math.max(max,length*breadth);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return max;
    }
}