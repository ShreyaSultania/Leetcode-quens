class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=B.length;
        int []C=new int[n];
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(A[i]);
            int c=0;
            int j=i;
            while(j>=0){
                if(set.contains(B[j])){
                c++;
            }
             j--;
            }
            C[i]=c;
        }
        return C;
    }
}