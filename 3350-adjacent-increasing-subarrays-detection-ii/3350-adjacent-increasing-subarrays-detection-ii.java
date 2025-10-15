import java.util.*;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int pre = 0, cur = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            cur++;
            // Break if next number is not strictly increasing or at the end
            if (i == n - 1 || nums.get(i) >= nums.get(i + 1)) {
                ans = Math.max(ans, cur / 2);              // Split current segment
                ans = Math.max(ans, Math.min(pre, cur));   // Combine with previous segment
                pre = cur;  // Move current to previous
                cur = 0;    // Reset for next segment
            }
        }

        return ans;
    }
}
