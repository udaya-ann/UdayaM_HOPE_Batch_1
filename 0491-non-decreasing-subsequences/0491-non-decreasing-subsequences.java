class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int[] nums, int start, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() >= 2) {
            ans.add(new ArrayList<>(list));
        }

        HashSet<Integer> used = new HashSet<>();

        for (int i = start; i < nums.length; i++) {

            if (used.contains(nums[i])) {
                continue;
            }

            if (list.size() == 0 || nums[i] >= list.get(list.size() - 1)) {
                used.add(nums[i]);

                list.add(nums[i]);

                backtrack(nums, i + 1, list, ans);

                list.remove(list.size() - 1);
            }
        }
    }
}