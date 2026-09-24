import java.util.*;

class Solution {

    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> ans = new ArrayList<>();
        backtrack(num, 0, ans);
        return ans;
    }

    public boolean backtrack(String s, int index, List<Integer> list) {

        if (index == s.length()) {
            return list.size() >= 3;
        }

        long value = 0;

        for (int i = index; i < s.length(); i++) {

            if (i > index && s.charAt(index) == '0') {
                break;
            }

            value = value * 10 + (s.charAt(i) - '0');

            if (value > Integer.MAX_VALUE) {
                break;
            }

            if (list.size() >= 2) {
                long sum = (long) list.get(list.size() - 1)
                         + list.get(list.size() - 2);

                if (value < sum) {
                    continue;
                }

                if (value > sum) {
                    break;
                }
            }

            list.add((int) value);

            if (backtrack(s, i + 1, list)) {
                return true;
            }

            list.remove(list.size() - 1);
        }

        return false;
    }
}