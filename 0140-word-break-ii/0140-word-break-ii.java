import java.util.*;

class Solution {

    Map<Integer, List<String>> map = new HashMap<>();
    Set<String> set;

    public List<String> wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);
        return solve(s, 0);
    }

    public List<String> solve(String s, int index) {

        if (map.containsKey(index)) {
            return map.get(index);
        }

        List<String> ans = new ArrayList<>();

        if (index == s.length()) {
            ans.add("");
            return ans;
        }

        for (int i = index + 1; i <= s.length(); i++) {

            String word = s.substring(index, i);

            if (set.contains(word)) {

                List<String> rest = solve(s, i);

                for (String r : rest) {

                    if (r.equals("")) {
                        ans.add(word);
                    } else {
                        ans.add(word + " " + r);
                    }
                }
            }
        }

        map.put(index, ans);

        return ans;
    }
}