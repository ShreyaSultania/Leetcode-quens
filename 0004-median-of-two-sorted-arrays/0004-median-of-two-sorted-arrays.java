class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
             arr[k]=nums1[i];
                i++;
                k++;
        }
         while(j<n){
             arr[k]=nums2[j];
                j++;
                k++;
        }
        int size=arr.length;
        if(size%2==0){
            return (arr[size/2]+arr[(size/2)-1])/2.0;
        }
        else{
            return arr[size/2];
        }
    }
}