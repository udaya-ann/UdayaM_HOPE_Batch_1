class Solution {
    int max = 0;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] count = new int[26];

        for (char c : letters) {
            count[c - 'a']++;
        }

        backtrack(words, score, count, 0, 0);

        return max;
    }

    public void backtrack(String[] words, int[] score, int[] count, int index, int total) {

        if (index == words.length) {
            max = Math.max(max, total);
            return;
        }

        // Skip
        backtrack(words, score, count, index + 1, total);

        // Check and Take
        String word = words[index];

        int[] used = new int[26];
        int wordScore = 0;
        boolean possible = true;

        for (int i = 0; i < word.length(); i++) {
            int x = word.charAt(i) - 'a';

            used[x]++;

            if (used[x] > count[x]) {
                possible = false;
                break;
            }

            wordScore += score[x];
        }

        if (possible) {

            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']--;
            }

            backtrack(words, score, count, index + 1, total + wordScore);

            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
            }
        }
    }
}