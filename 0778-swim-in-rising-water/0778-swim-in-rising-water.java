

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited = new boolean[n][n];
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0}); 
        visited[0][0] = true;
        
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0], r = cur[1], c = cur[2];
            
            if (r == n - 1 && c == n - 1) return time; 
            
            for (int[] d : directions) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    pq.offer(new int[]{Math.max(time, grid[nr][nc]), nr, nc});
                }
            }
        }
        
        return -1;
    }
}
