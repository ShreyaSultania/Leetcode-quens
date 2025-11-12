class Solution {
    public int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public int minOperations(int[] nums) {
        int n=nums.length;
         int countOnes = 0;

        // Step 1: Count number of ones
        for (int x : nums) {
            if (x == 1) countOnes++;
        }

        // Case 1: There are already some 1s
        if (countOnes > 0) return n - countOnes;

        // Step 2: Find smallest subarray with GCD = 1
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // No need to expand further
                }
            }
        }

        // Case 2: If no subarray gives GCD 1 → impossible
        if (minLen == Integer.MAX_VALUE) return -1;

        // Case 3: Compute total operations
        return (minLen - 1) + (n - 1);
    
    }
}