class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        int n=nums.length;
        int tot=1<<n;
        Arrays.sort(nums);
        for(int i=0;i<tot;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return new ArrayList<>(ans);
    }
}