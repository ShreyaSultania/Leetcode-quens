class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int c=0;
        int[][]pre=new int[row+1][col+1];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                pre[i + 1][j + 1] = grid[i][j]+ pre[i][j + 1]+ pre[i + 1][j] - pre[i][j];
                if(pre[i+1][j+1]<=k) c++;
            }
        }
        return c;
    }
}