import java.util.*;

class Solution {

    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();

        backtrack(num, target, 0, 0, 0, "", ans);

        return ans;
    }

    public void backtrack(String num, int target, int index,
                           long value, long prev,
                           String exp, List<String> ans) {

        if (index == num.length()) {
            if (value == target) {
                ans.add(exp);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            if (i > index && num.charAt(index) == '0') {
                break;
            }

            String s = num.substring(index, i + 1);
            long current = Long.parseLong(s);

            if (index == 0) {
                backtrack(num, target, i + 1,
                          current, current, s, ans);
            } else {

                backtrack(num, target, i + 1,
                          value + current, current,
                          exp + "+" + s, ans);

                backtrack(num, target, i + 1,
                          value - current, -current,
                          exp + "-" + s, ans);

                backtrack(num, target, i + 1,
                          value - prev + prev * current,
                          prev * current,
                          exp + "*" + s, ans);
            }
        }
    }
}