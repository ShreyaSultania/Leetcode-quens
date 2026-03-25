class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long row[][] = new long[m][n];
        long col[][] = new long[m][n];

        // row prefix
        for (int i = 0; i < m; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                row[i][j] = sum;
            }
        }

        // col prefix
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < m; j++) {
                sum += grid[j][i];
                col[j][i] = sum;
            }
        }

        // total
        long total = 0;
        for (int i = 0; i < m; i++) {
            total += row[i][n - 1];
        }

        // horizontal cut
        long sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += row[i][n - 1];
            if (sum * 2 == total) return true;
        }

        // vertical cut
        sum = 0;
        for (int j = 0; j < n - 1; j++) {
            sum += col[m - 1][j];
            if (sum * 2 == total) return true;
        }

        return false;
    }
}