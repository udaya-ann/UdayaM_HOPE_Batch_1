class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;

        int[] result=new int[nums.length];

        int k=right;

        while(k>=0){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[k]=nums[left]*nums[left];
                k--;
                left++;
            }else{
                result[k]=nums[right]*nums[right];
                k--;
                right--;
            }
        }
        return result;

    }
}