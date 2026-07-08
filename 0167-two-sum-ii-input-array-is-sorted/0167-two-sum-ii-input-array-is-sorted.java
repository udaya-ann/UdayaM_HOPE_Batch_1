class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }else if(sum>target)right--;
            else {
                left++;
            }

        }
        return arr;
    }
}