import java.util.*;

class Solution {
    public int minCut(String s) {
        int n = s.length();

        boolean[][] pal = new boolean[n][n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = i;

            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == s.charAt(i) &&
                    (i - j <= 2 || pal[j + 1][i - 1])) {

                    pal[j][i] = true;

                    if (j == 0) {
                        dp[i] = 0;
                    } else {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }

        return dp[n - 1];
    }
}