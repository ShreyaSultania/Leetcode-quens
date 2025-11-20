class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int j=0;j<=i;j++){
               if(i==j || j==0) arr.add(1);
               else{
                arr.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
               }
            }
            ans.add(arr);
        }
        return ans;
    }}