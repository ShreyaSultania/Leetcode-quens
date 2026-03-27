class Solution {
    void leftShift( ArrayList<Integer>arr,int i,int j,int k){
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        k=k%n;
        for(int i=0;i<m;i++){
            ArrayList<Integer>Original=new ArrayList<>();
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(mat[i][j]);
                Original.add(mat[i][j]);
            }
            if(i%2==0){
                leftShift(temp,0,temp.size()-1,k);
                leftShift(temp,0,k-1,k);
                leftShift(temp,k,temp.size()-1,k);
            }
            else{
                leftShift(temp,0,k-1,k);
                leftShift(temp,k,temp.size()-1,k);
                leftShift(temp,0,temp.size()-1,k);
            }
            for(int l=0;l<temp.size();l++){
                if(temp.get(l)!=Original.get(l)) return false;
            }
        }
        return true;
    }
}