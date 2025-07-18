class Solution {
    int dfs(int[][] grid,int row,int col,int i,int j){
        if(i<0 || j<0 || i==row || j==col || grid[i][j]==0){
            return 0;
        }
        
         grid[i][j]=0;
         int temp=1;
         temp=temp+dfs(grid,row,col,i,j+1);
          temp=temp+dfs(grid,row,col,i-1,j);
          temp=temp+dfs(grid,row,col,i,j-1);
            temp=temp+dfs(grid,row,col,i+1,j);
        return temp;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int max=0;
        int temp=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                   int area= dfs(grid,row,col,i,j);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
}