class Solution {
    List<String> ans = new ArrayList<>();
    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {

  if (digits.length() == 0)
            return ans;
        solve(0, digits, "");
        return ans;
    }
    void solve(int index, String digits, String str) {
        if (index == digits.length()) {
            ans.add(str);
            return;
        }
        int num = digits.charAt(index) - '0';
        String letters = map[num];
        for (char ch : letters.toCharArray()) {
            solve(index + 1, digits, str + ch);
        }
    }
}