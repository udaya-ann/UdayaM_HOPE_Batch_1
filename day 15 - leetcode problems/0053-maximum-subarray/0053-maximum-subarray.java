class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currsum=0;
        for(int n: nums){
            currsum+=n;
            if(currsum>max){
                max=currsum;
            }
            if(currsum<0)currsum=0;
        }
        return max;
    }
}