class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> curr=new ArrayList<>();

         backtrack(0,nums,curr,ans);
         return ans;
    }
    public void backtrack(int start,  int[] nums, List<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(i+1,nums,curr,ans);
            curr.remove(curr.size()-1);
        }

    }
}