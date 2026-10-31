
class Solution {
    public int uniquePaths(int[][] grid) {
        int MOD = 1_000_000_007;
        int m = grid.length;
        int n = grid[0].length;
        long[][] dp = new long[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }
                long ways = dp[i][j];
                for (int dir = 0; dir < 2; dir++) {
                    int r = i;
                    int c = j;
                    if (dir == 0) {
                        c++;
                    } else {
                        r++;
                    }
                    int d = dir;
                    while (r < m && c < n && grid[r][c] == 1) {
                        if (d == 0) {
                            r++;
                            d = 1;
                        } else {
                            c++;
                            d = 0;
                        }
                    }
                    if (r < m && c < n) {
                        dp[r][c] = (dp[r][c] + ways) % MOD;
                    }
                }
            }
        }
        return (int) dp[m - 1][n - 1];
    }
}
