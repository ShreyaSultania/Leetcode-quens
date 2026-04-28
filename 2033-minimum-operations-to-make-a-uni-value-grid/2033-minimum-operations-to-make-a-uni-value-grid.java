class Solution {
    public int minOperations(int[][] grid, int x) {
        int minOp=0;
        int m=grid.length;
        int n=grid[0].length;
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr.add(grid[i][j]);
            }
        }
        Collections.sort(arr);
        int ele=arr.get(arr.size()/2);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<ele){
                if((ele-arr.get(i))%x!=0) return -1;
                minOp+=(ele-arr.get(i))/x;
                // arr.set(i,ele);
                
            }
            else if(arr.get(i)>ele){
                if((arr.get(i)-ele)%x!=0) return -1;
                minOp+=((arr.get(i)-ele)/x);
                arr.set(i,ele);
            }
        }
        return minOp;
    }
}