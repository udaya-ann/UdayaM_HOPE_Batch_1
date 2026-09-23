class Solution {
    int count = 0;
    int empty = 0;

    public int uniquePathsIII(int[][] grid) {
        int sr = 0;
        int sc = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sr = i;
                    sc = j;
                }

                if (grid[i][j] == 0) {
                    empty++;
                }
            }
        }

        dfs(grid, sr, sc, empty);

        return count;
    }

    public void dfs(int[][] grid, int r, int c, int remain) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            return;
        }

        if (grid[r][c] == -1 || grid[r][c] == 3) {
            return;
        }

        if (grid[r][c] == 2) {
            if (remain == -1) {
                count++;
            }
            return;
        }

        grid[r][c] = 3;

        dfs(grid, r + 1, c, remain - 1);
        dfs(grid, r - 1, c, remain - 1);
        dfs(grid, r, c + 1, remain - 1);
        dfs(grid, r, c - 1, remain - 1);

        grid[r][c] = 0;
    }
}