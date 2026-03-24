class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int MOD = 12345;

        int row = grid.length;
        int col = grid[0].length;
        int n = row * col;

        int[] arr = new int[n];

        int idx = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[idx++] = grid[i][j] % MOD;
            }
        }

        int[] res = new int[n];

        res[0] = 1;
        for(int i = 1; i < n; i++){
            res[i] = (res[i-1] * arr[i-1]) % MOD; 
        }
        int right = 1;
        for(int i = n-1; i >= 0; i--){
            res[i] = (res[i] * right) % MOD;
            right = (right * arr[i]) % MOD;        // ✅ FIX
        }

        // Step 4: map back
        int[][] ans = new int[row][col];
        idx = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ans[i][j] = res[idx++];
            }
        }

        return ans;
    }
}