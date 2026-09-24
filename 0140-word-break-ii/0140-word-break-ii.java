import java.util.*;

class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>(wordDict);

        backtrack(s, 0, set, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(String s, int index, Set<String> set,
                           List<String> path, List<String> ans) {

        if (index == s.length()) {
            ans.add(String.join(" ", path));
            return;
        }

        for (int i = index + 1; i <= s.length(); i++) {

            String word = s.substring(index, i);

            if (set.contains(word)) {

                path.add(word);

                backtrack(s, i, set, path, ans);

                path.remove(path.size() - 1);
            }
        }
    }
}