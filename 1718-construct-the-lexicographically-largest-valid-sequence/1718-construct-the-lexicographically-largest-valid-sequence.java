class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] ans = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];

        backtrack(ans, used, n, 0);

        return ans;
    }

    public boolean backtrack(int[] ans, boolean[] used, int n, int index) {
        if (index == ans.length) {
            return true;
        }

        if (ans[index] != 0) {
            return backtrack(ans, used, n, index + 1);
        }

        for (int num = n; num >= 1; num--) {
            if (used[num]) {
                continue;
            }

            if (num == 1) {
                ans[index] = 1;
                used[1] = true;

                if (backtrack(ans, used, n, index + 1)) {
                    return true;
                }

                ans[index] = 0;
                used[1] = false;
            } 
            else {
                int second = index + num;

                if (second >= ans.length || ans[second] != 0) {
                    continue;
                }

                ans[index] = num;
                ans[second] = num;
                used[num] = true;

                if (backtrack(ans, used, n, index + 1)) {
                    return true;
                }

                ans[index] = 0;
                ans[second] = 0;
                used[num] = false;
            }
        }

        return false;
    }
}