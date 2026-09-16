class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];

        int xor = 0;
        int max = (1 << maximumBit) - 1;

        for (int num : nums) {
            xor = xor ^ num;
        }

        for (int i = 0; i < n; i++) {
            ans[i] = xor ^ max;
            xor = xor ^ nums[n - 1 - i];
        }

        return ans;
    }
}