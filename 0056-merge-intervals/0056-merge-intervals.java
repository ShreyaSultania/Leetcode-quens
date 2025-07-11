
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

           
            if (res.isEmpty() || res.get(res.size() - 1).get(1) < start) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                res.add(temp);
            } else {
                res.get(res.size() - 1).set(1, Math.max(res.get(res.size() - 1).get(1), end));
            }
        }

        // Convert ArrayList<ArrayList<Integer>> to int[][]
        int[][] arr = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            arr[i][0] = res.get(i).get(0);
            arr[i][1] = res.get(i).get(1);
        }

        return arr;
    }
}

