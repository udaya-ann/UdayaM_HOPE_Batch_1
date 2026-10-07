class Solution {
    public int paintWalls(int[] cost, int[] time) {

        int n = cost.length;
        int INF = 1000000000;

        int[] dp = new int[n + 1];

        Arrays.fill(dp, INF);

        dp[0] = 0;

        for (int i = 0; i < n; i++) {

            for (int j = n; j >= 0; j--) {

                if (dp[j] == INF) {
                    continue;
                }

                int newWalls = Math.min(n, j + time[i] + 1);

                dp[newWalls] = Math.min(
                    dp[newWalls],
                    dp[j] + cost[i]
                );
            }
        }

        return dp[n];
    }
}