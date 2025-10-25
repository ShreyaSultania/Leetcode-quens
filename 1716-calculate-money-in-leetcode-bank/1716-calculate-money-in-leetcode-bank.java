class Solution {
    public int totalMoney(int n) {
       int weeks=n/7;
       int days=n%7;
       int fullWeekSum = weeks * (28 + (28 + (weeks - 1) * 7)) / 2;
        int start = weeks + 1;
        int remainingSum = 0;
        for (int i = 0; i < days; i++) {
            remainingSum += start + i;
        }

        return fullWeekSum + remainingSum;
    }
}