class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m=arr1.length;
        int n=arr2.length;
        int ans=0;
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                int k=Math.abs(arr1[i]-arr2[j]);
                if(k>d) c++;
            }
            if(c==n) ans++;
        }
        return ans;
    }
}