
class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        // sort by end asc, and if end equal then start desc
        Arrays.sort(intervals, (x, y) -> {
            if (x[1] != y[1]) return Integer.compare(x[1], y[1]);
            return Integer.compare(y[0], x[0]);
        });

        int res = 0;
        // a and b are the last two chosen points (keep them as the two largest chosen so far)
        // initialize to very small values
        int a = -1_000_000_000, b = -1_000_000_000;

        for (int[] interval : intervals) {
            int l = interval[0], r = interval[1];
            if (b < l) {
                // no chosen point in [l, r], need two new points
                res += 2;
                a = r - 1;
                b = r;
            } else if (a < l && l <= b) {
                // exactly one chosen point in [l, r] (which is b), add one more
                res += 1;
                a = b;
                b = r;
            } else {
                // both a and b are already in [l, r], do nothing
            }
        }
        return res;
    }
}
