class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int MOD = 1000000007;

        int[][] dp = new int[n + 1][minProfit + 1];

        dp[0][0] = 1;

        for (int i = 0; i < group.length; i++) {
            int people = group[i];
            int money = profit[i];

            for (int j = n; j >= people; j--) {
                for (int k = 0; k <= minProfit; k++) {

                    int newProfit = Math.min(minProfit, k + money);

                    dp[j][newProfit] =
                        (dp[j][newProfit] + dp[j - people][k]) % MOD;
                }
            }
        }

        int ans = 0;

        for (int j = 0; j <= n; j++) {
            ans = (ans + dp[j][minProfit]) % MOD;
        }

        return ans;
    }
}