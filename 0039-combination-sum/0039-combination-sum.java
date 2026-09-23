class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int[] c,int t, int s,List<Integer> curr, List<List<Integer>> result ){
        if(t==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=s;i<c.length;i++){
            if(c[i]>t){
                return;
            }
            curr.add(c[i]);
            backtrack(c,t-c[i],i,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}