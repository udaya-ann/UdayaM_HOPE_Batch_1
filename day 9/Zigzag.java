public class Zigzag {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = "";

        int index = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            rows[index] += c;

            if (index == 0) down = true;
            else if (index == numRows - 1) down = false;

            if (down) index++;
            else index--;
        }

        String result = "";
        for (String row : rows) result += row;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}

