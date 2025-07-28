class Solution {
    int ncr(int row,int col){
        if(row==0 || col==0) return 1;
        int res=1;
        for(int i=0;i<col;i++){
            res=res*(row-i);
            res=res/(i+1);
        }
        return res;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
               temp.add(ncr(i,j));
            }
            ans.add(temp);
        }
        return ans;
    }
}