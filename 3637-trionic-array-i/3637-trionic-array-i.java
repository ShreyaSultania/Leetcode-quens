class Solution {
    public boolean isTrionic(int[] arr) {
        boolean flag=true;
        int n=arr.length;
        int p=-1;
        int q=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1 || p==n-2 || p==0) return false;
        for(int i=p;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                q=i;
                break;
            }
        }
        if(q==-1 || q==n-1) return false;
        for(int i=q;i<n-1;i++){
             if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}