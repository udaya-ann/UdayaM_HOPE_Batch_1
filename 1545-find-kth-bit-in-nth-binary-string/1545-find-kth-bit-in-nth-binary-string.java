class Solution {
    public char findKthBit(int n, int k) {
        int flips = 0;

        while (k != 1) {
            int len = (1 << n) - 1;
            int mid = (len + 1) / 2;

            if (k == mid) {
                return flips % 2 == 0 ? '1' : '0';
            }

            if (k > mid) {
                k = len + 1 - k;
                flips++;
            }

            n--;
        }

        return flips % 2 == 0 ? '0' : '1';
    }
}