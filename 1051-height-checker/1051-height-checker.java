class Solution {
    public int heightChecker(int[] heights) {
        int[] correct=heights.clone();
        Arrays.sort(correct);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=correct[i]){
                count++;
            }
        }
        return count;
    }
}