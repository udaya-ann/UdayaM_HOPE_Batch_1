class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] points = new int[max + 1];

        for (int num : nums) {
            points[num] += num;
        }

        int prev2 = 0;
        int prev1 = 0;

        for (int i = 1; i <= max; i++) {

            int current = Math.max(prev1, prev2 + points[i]);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}