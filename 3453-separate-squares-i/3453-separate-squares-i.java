class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        // Find search boundaries
        for (int[] s : squares) {
            low = Math.min(low, s[1]);
            high = Math.max(high, s[1] + s[2]);
        }

        // Binary search
        for (int i = 0; i < 100; i++) {
            double mid = (low + high) / 2;
            double below = 0, above = 0;

            for (int[] s : squares) {
                double y = s[1];
                double side = s[2];
                double top = y + side;
                double area = side * side;

                if (mid <= y) {
                    above += area;
                } else if (mid >= top) {
                    below += area;
                } else {
                    below += (mid - y) * side;
                    above += (top - mid) * side;
                }
            }

            if (below < above) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
