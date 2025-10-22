import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int ans = 1;
        int adjustable = 0;  // number of elements that *could* be changed to current candidate value
        Map<Integer, Integer> count = new HashMap<>();
        TreeMap<Integer, Integer> line = new TreeMap<>();
        TreeSet<Integer> candidates = new TreeSet<>();

        for (int num : nums) {
            // count how many are already equal to num
            count.merge(num, 1, Integer::sum);
            // mark the range of values that this element can reach: [num - k, num + k]
            line.merge(num - k, +1, Integer::sum);
            line.merge(num + k + 1, -1, Integer::sum);

            // include possible candidate values
            candidates.add(num);
            candidates.add(num - k);
            candidates.add(num + k + 1);
        }

        for (int v : candidates) {
            adjustable += line.getOrDefault(v, 0);
            int already = count.getOrDefault(v, 0);
            int canChange = adjustable - already;
            int useOps = Math.min(numOperations, canChange);
            ans = Math.max(ans, already + useOps);
        }

        return ans;
    }
}
