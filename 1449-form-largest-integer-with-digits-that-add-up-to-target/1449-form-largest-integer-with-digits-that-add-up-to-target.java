class Solution {
    public String largestNumber(int[] cost, int target) {

        int[] dp = new int[target + 1];

        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int t = 1; t <= target; t++) {
            for (int i = 0; i < 9; i++) {

                if (t >= cost[i] && dp[t - cost[i]] != -1) {
                    dp[t] = Math.max(dp[t], dp[t - cost[i]] + 1);
                }
            }
        }

        if (dp[target] == -1) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (int digit = 9; digit >= 1; digit--) {

            while (target >= cost[digit - 1]
                    && dp[target] == dp[target - cost[digit - 1]] + 1) {

                ans.append(digit);
                target -= cost[digit - 1];
            }
        }

        return ans.toString();
    }
}