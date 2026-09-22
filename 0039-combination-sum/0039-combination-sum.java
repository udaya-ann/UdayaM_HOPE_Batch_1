class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();

        q.add(new ArrayList<>());

        while (!q.isEmpty()) {
            List<Integer> list = q.poll();

            int sum = 0;
            int start = 0;

            for (int x : list) {
                sum += x;
            }

            if (sum == target) {
                ans.add(list);
                continue;
            }

            for (int i = 0; i < candidates.length; i++) {

                if (list.size() > 0 && candidates[i] < list.get(list.size() - 1)) {
                    continue;
                }

                if (sum + candidates[i] <= target) {
                    List<Integer> temp = new ArrayList<>(list);
                    temp.add(candidates[i]);
                    q.add(temp);
                }
            }
        }

        return ans;
    }
}