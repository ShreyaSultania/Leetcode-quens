class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;
        while(low<=high){
            int mid=(low+high)/2;
            int value=matrix[mid/col][mid%co
            l];
            if(value==target) return true;
           else if(value<target) low=mid+1;
    else high=mid-1;
        }
        return false;
    }
}