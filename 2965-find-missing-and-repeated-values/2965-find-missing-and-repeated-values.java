class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!map.containsKey(grid[i][j])){
                    map.put(grid[i][j],1);
                }
                else{
                    int freq= map.get(grid[i][j]);
                     map.put(grid[i][j],freq+1);
                }
            }
        }
            for(int i=1;i<=n*n;i++){
                if(!map.containsKey(i)){
                    ans[1]=i;
                }
                else if(map.containsKey(i) && map.get(i)==2){
                    ans[0]=i;
                }
            }
            return ans;
    }
}