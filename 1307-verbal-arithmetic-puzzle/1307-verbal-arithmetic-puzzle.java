class Solution {

    int[] map = new int[26];
    boolean[] used = new boolean[10];
    String[] words;
    String result;
    int maxLen;

    public boolean isSolvable(String[] words, String result) {

        this.words = words;
        this.result = result;

        Arrays.fill(map, -1);

        maxLen = result.length();

        for (String word : words) {
            maxLen = Math.max(maxLen, word.length());
        }

        boolean[] leading = new boolean[26];

        for (String word : words) {
            if (word.length() > 1) {
                leading[word.charAt(0) - 'A'] = true;
            }
        }

        if (result.length() > 1) {
            leading[result.charAt(0) - 'A'] = true;
        }

        return solve(0, 0, leading);
    }

    public boolean solve(int column, int carry, boolean[] leading) {

        if (column == maxLen) {
            return carry == 0;
        }

        int sum = carry;

        for (String word : words) {

            int index = word.length() - 1 - column;

            if (index >= 0) {

                int letter = word.charAt(index) - 'A';

                if (map[letter] == -1) {
                    for (int digit = 0; digit <= 9; digit++) {

                        if (used[digit]) {
                            continue;
                        }

                        if (digit == 0 && leading[letter]) {
                            continue;
                        }

                        map[letter] = digit;
                        used[digit] = true;

                        if (solve(column, carry, leading)) {
                            return true;
                        }

                        map[letter] = -1;
                        used[digit] = false;
                    }

                    return false;
                }

                sum += map[letter];
            }
        }

        int resultIndex = result.length() - 1 - column;

        if (resultIndex < 0) {
            return sum == 0;
        }

        int resultLetter = result.charAt(resultIndex) - 'A';

        int digit = sum % 10;
        int newCarry = sum / 10;

        if (map[resultLetter] != -1) {

            if (map[resultLetter] != digit) {
                return false;
            }

            return solve(column + 1, newCarry, leading);
        }

        if (used[digit]) {
            return false;
        }

        if (digit == 0 && leading[resultLetter]) {
            return false;
        }

        map[resultLetter] = digit;
        used[digit] = true;

        if (solve(column + 1, newCarry, leading)) {
            return true;
        }

        map[resultLetter] = -1;
        used[digit] = false;

        return false;
    }
}