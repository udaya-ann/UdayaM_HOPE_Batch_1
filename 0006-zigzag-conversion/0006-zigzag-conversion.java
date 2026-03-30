class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int index = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            rows[index].append(c);

            if (index == 0) down = true;
            else if (index == numRows - 1) down = false;

            index += down ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) result.append(row);

        return result.toString();
    }
}