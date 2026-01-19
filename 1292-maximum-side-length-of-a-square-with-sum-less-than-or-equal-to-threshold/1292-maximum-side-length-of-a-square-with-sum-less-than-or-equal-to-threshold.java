class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;
        int maxSize = 0;

        // Try all possible square sizes
        for (int k = 1; k <= Math.min(m, n); k++) {

            // Try all top-left positions
            for (int i = 0; i + k <= m; i++) {
                for (int j = 0; j + k <= n; j++) {

                    int sum = 0;

                    // Calculate sum of k x k square
                    for (int r = i; r < i + k; r++) {
                        for (int c = j; c < j + k; c++) {
                            sum += mat[r][c];
                        }
                    }

                    // Check threshold
                    if (sum <= threshold) {
                        maxSize = Math.max(maxSize, k);
                    }
                }
            }
        }

        return maxSize;
    }
}
