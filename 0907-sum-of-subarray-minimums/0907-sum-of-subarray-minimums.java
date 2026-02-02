class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        // left+1
        // right+1
        int []nsi=new int[n];
        int []psi=new int[n];
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        nsi[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()) nsi[i]=n;
            else{
                nsi[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        st.push(0);
        psi[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            if(st.isEmpty()) psi[i]=-1;
            else{
                psi[i]=st.peek();
            }
            st.push(i);
        }
    long sum=0;
    int mod = 1_000_000_007;
        for(int i=0;i<n;i++){
            int a=i-psi[i];
            int b=nsi[i]-i;
            sum = (sum + ((long)a * b * arr[i]) % mod) % mod;
        }
        return (int)sum;
    }
}