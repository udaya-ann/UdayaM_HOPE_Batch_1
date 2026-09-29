class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int oneDay = dp[i - 1] + costs[0];

            int j = i - 1;
            while (j >= 0 && days[j] >= days[i - 1] - 6) {
                j--;
            }
            int sevenDay = dp[j + 1] + costs[1];

            j = i - 1;
            while (j >= 0 && days[j] >= days[i - 1] - 29) {
                j--;
            }
            int thirtyDay = dp[j + 1] + costs[2];

            dp[i] = Math.min(oneDay, Math.min(sevenDay, thirtyDay));
        }

        return dp[n];
    }
}