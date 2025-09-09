class Solution {
long M=1000000007;
    int solve(int day,int forget,int delay,int []arr){
        if(day==1) return 1;
        if(arr[day]!=-1) return arr[day];
        int res=0;
        for(int i=day-forget+1;i<=day-delay;i++){
            if(i>0){
                res=res+solve(i,forget,delay,arr);
            }
        }
        return arr[day]=res;
    }
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int total=0;
        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        for(int day=n-forget+1;day<=n;day++){
            if(day>0) total=(total+solve(day,forget,delay,arr));
        }
        return total;
    }
}