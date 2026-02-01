class Solution {
    public int minimumCost(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int cost = arr[0];
                for(int k=1;k<n;k++){
                    if(k==i+1) cost+=arr[k];
                    else if(k==j+1) cost+=arr[k];

                }
                min = Math.min(min,cost);
            }
        }
        return min;
    }
}