class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] dp = new long[n];
        dp[0] = (long) skill[0] * mana[0];
        for (int i = 1; i < n; i++)
            dp[i] = dp[i-1] + (long) skill[i] * mana[0];

        for (int j = 1; j < m; j++) {
            dp[0] += (long) skill[0] * mana[j];
            for (int i = 1; i < n; i++) {
                long start = Math.max(dp[i], dp[i-1]);
                dp[i] = start + (long) skill[i] * mana[j];
            }
            for (int i = n - 2; i >= 0; i--) {
                long possible = dp[i+1] - (long) skill[i+1] * mana[j];
                if (dp[i] < possible) dp[i] = possible;
            }
        }
        return dp[n - 1];
    }
}
