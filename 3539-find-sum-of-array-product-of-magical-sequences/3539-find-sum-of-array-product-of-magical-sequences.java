class Solution {
    final int MOD = 1_000_000_007;
    int N, M, K;
    Map<String, Long> memo = new HashMap<>();

    long solve(int count, long sum, int[] nums) {
        if (count == M) {
            // Base condition — when we have picked M elements
            return (Long.bitCount(sum) == K) ? 1 : 0;
        }

        String key = count + "_" + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        long totalSum = 0;
        for (int i = 0; i < N; i++) {
            long newSum = sum + (1L << i);

            long prod = (nums[i] * solve(count + 1, newSum, nums)) % MOD;

            totalSum = (totalSum + prod) % MOD;
        }

        memo.put(key, totalSum);
        return totalSum;
    }

    public int magicalSum(int m, int k, int[] nums) {
        this.M = m;
        this.K = k;
        this.N = nums.length;
        memo.clear();
        return (int)(solve(0, 0L, nums) % MOD);
    }
}