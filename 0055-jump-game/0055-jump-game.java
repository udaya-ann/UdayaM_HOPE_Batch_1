class Solution {
    public boolean canJump(int[] nums) {
        int des=nums.length-1;
        for(int curr=nums.length-2;curr>=0;curr--){
            if(curr+nums[curr]>=des){
                des=curr;
            }
        }
        return des==0;
    }
}