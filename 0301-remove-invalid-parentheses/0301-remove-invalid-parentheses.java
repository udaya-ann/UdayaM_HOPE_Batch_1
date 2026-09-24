import java.util.*;

class Solution {
    Set<String> set = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int left = 0;
        int right = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        backtrack(s, 0, 0, left, right, new StringBuilder());

        return new ArrayList<>(set);
    }

    public void backtrack(String s, int index, int balance,
                           int left, int right, StringBuilder path) {

        if (index == s.length()) {
            if (balance == 0 && left == 0 && right == 0) {
                set.add(path.toString());
            }
            return;
        }

        char c = s.charAt(index);

        if (c == '(') {
            if (left > 0) {
                backtrack(s, index + 1, balance,
                           left - 1, right, path);
            }

            path.append(c);

            backtrack(s, index + 1, balance + 1,
                       left, right, path);

            path.deleteCharAt(path.length() - 1);

        } else if (c == ')') {
            if (right > 0) {
                backtrack(s, index + 1, balance,
                           left, right - 1, path);
            }

            if (balance > 0) {
                path.append(c);

                backtrack(s, index + 1, balance - 1,
                           left, right, path);

                path.deleteCharAt(path.length() - 1);
            }

        } else {
            path.append(c);

            backtrack(s, index + 1, balance,
                       left, right, path);

            path.deleteCharAt(path.length() - 1);
        }
    }
}