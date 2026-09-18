class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int code = 0;

        for (int i = 0; i < s.length(); i++) {
            code = (code << 2) | getCode(s.charAt(i));

            if (i >= 9) {
                code = code & ((1 << 20) - 1);

                map.put(code, map.getOrDefault(code, 0) + 1);

                if (map.get(code) == 2) {
                    ans.add(s.substring(i - 9, i + 1));
                }
            }
        }

        return ans;
    }

    public int getCode(char c) {
        if (c == 'A') return 0;
        if (c == 'C') return 1;
        if (c == 'G') return 2;
        return 3;
    }
}