import java.util.Arrays;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        double left = 0.0;
        double right = 1.0;

        while (left < right) {

            double mid = left + (right - left) / 2;

            int count = 0;
            int numerator = 0;
            int denominator = 1;

            int j = 1;

            for (int i = 0; i < arr.length - 1; i++) {

                while (j < arr.length && arr[i] > mid * arr[j]) {
                    j++;
                }

                if (j == arr.length) {
                    break;
                }

                count += arr.length - j;

                if ((double) arr[i] / arr[j] > (double) numerator / denominator) {
                    numerator = arr[i];
                    denominator = arr[j];
                }
            }

            if (count < k) {
                left = mid;
            } else {
                right = mid;
            }

            if (count == k) {
                return new int[]{numerator, denominator};
            }
        }

        return new int[]{0, 1};
    }
}