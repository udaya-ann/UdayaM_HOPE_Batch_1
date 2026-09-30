class Solution {

    int max = 0;

    public int maximumGood(int[][] statements) {
        int n = statements.length;
        boolean[] good = new boolean[n];

        backtrack(statements, good, 0);

        return max;
    }

    public void backtrack(int[][] statements, boolean[] good, int index) {

        if (index == statements.length) {

            if (isValid(statements, good)) {

                int count = 0;

                for (boolean x : good) {
                    if (x) {
                        count++;
                    }
                }

                max = Math.max(max, count);
            }

            return;
        }

        // Person is bad
        good[index] = false;
        backtrack(statements, good, index + 1);

        // Person is good
        good[index] = true;
        backtrack(statements, good, index + 1);
    }

    public boolean isValid(int[][] statements, boolean[] good) {

        int n = statements.length;

        for (int i = 0; i < n; i++) {

            if (!good[i]) {
                continue;
            }

            for (int j = 0; j < n; j++) {

                if (statements[i][j] == 2) {
                    continue;
                }

                if (statements[i][j] == 1 && !good[j]) {
                    return false;
                }

                if (statements[i][j] == 0 && good[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}