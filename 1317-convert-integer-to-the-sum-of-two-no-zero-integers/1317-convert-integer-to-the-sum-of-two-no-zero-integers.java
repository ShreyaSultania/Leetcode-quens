class Solution {
    boolean check(int n){
        while(n>0){
            int rem=n%10;
            if(rem==0) return false;
            n=n/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=1;i<=n;i++){
            arr[0]=i;
            arr[1]=n-i;
            if(check(arr[0]) && check(arr[1]) && arr[0]+arr[1]==n) {

                return arr;
        }
        }
        return arr;
    }
}