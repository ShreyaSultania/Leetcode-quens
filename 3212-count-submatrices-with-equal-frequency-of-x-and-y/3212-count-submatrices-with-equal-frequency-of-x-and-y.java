class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] mat = new int[row][col];
        int[][] countX = new int[row+1][col+1];

        // Build matrices
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 'X') {
                    mat[i][j] = 1;
                } else if(grid[i][j] == 'Y') {
                    mat[i][j] = -1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        int[][] pre = new int[row+1][col+1];
        int c = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                // sum prefix
                pre[i+1][j+1] = mat[i][j] 
                                + pre[i+1][j] 
                                + pre[i][j+1] 
                                - pre[i][j];

                // count X prefix
                countX[i+1][j+1] = (grid[i][j] == 'X' ? 1 : 0)
                                  + countX[i+1][j]
                                  + countX[i][j+1]
                                  - countX[i][j];

                // ✅ FIXED CONDITION
                if(pre[i+1][j+1] == 0 && countX[i+1][j+1] > 0) {
                    c++;
                }
            }
        }

        return c;
    }
}