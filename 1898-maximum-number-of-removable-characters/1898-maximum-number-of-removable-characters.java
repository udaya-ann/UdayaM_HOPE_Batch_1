class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {

        int left = 0;
        int right = removable.length;

        while (left < right) {

            int mid = left + (right - left + 1) / 2;

            if (isSubsequence(s, p, removable, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public boolean isSubsequence(String s, String p, int[] removable, int k) {

        boolean[] removed = new boolean[s.length()];

        for (int i = 0; i < k; i++) {
            removed[removable[i]] = true;
        }

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            if (!removed[i] && j < p.length() && s.charAt(i) == p.charAt(j)) {
                j++;
            }
        }

        return j == p.length();
    }
}