class Solution {
    public int tallestBillboard(int[] rods) {

        int sum = 0;

        for (int rod : rods) {
            sum += rod;
        }

        int[] dp = new int[sum + 1];

        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int rod : rods) {

            int[] next = dp.clone();

            for (int diff = 0; diff <= sum; diff++) {

                if (dp[diff] == -1) {
                    continue;
                }

                int taller = diff + rod;

                next[taller] = Math.max(
                    next[taller],
                    dp[diff]
                );

                int newDiff = Math.abs(diff - rod);

                int newShorter = dp[diff] + Math.min(diff, rod);

                next[newDiff] = Math.max(
                    next[newDiff],
                    newShorter
                );
            }

            dp = next;
        }

        return dp[0];
    }
}