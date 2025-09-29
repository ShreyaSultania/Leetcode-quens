class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        Integer[][] dp = new Integer[n][n];
        return solve(values, 0, n-1, dp);
    }

    private int solve(int[] values, int i, int j, Integer[][] dp) {
        // Base case: no triangle possible if less than 3 vertices
        if (j - i < 2) return 0;
        if (dp[i][j] != null) return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for (int k = i+1; k < j; k++) {
            int score = values[i] * values[j] * values[k]
                        + solve(values, i, k, dp)
                        + solve(values, k, j, dp);
            ans = Math.min(ans, score);
        }

        return dp[i][j] = ans;
    }
}
