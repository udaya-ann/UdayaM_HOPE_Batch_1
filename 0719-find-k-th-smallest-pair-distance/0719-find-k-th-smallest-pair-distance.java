import java.util.Arrays;

class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums[nums.length - 1] - nums[0];

        while (left < right) {

            int mid = left + (right - left) / 2;

            int count = 0;
            int l = 0;

            for (int r = 0; r < nums.length; r++) {

                while (nums[r] - nums[l] > mid) {
                    l++;
                }

                count += r - l;
            }

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}