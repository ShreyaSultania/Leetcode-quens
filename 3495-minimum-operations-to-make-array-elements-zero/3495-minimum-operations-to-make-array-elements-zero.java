class Solution {
    public long solve(int l,int r){
    long L=1;
    long S=1;
    long steps=0;
    while(L<=r){
        long R=(4*L-1);
        long start=Math.max(l,L);
        long end=Math.min(R,r);
        if(start<=end){
            steps+=(end-start+1)*S;
        }
        L=L*4;
        S++;
    }
    
    return steps;
}
    public long minOperations(int[][] queries) {
        long c=0;
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            long steps=solve(l,r);
            c+=(steps+1)/2;
        }
        return c;
    }
}