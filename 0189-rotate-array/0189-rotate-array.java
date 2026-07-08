class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] arr=new int[nums.length];
        int st=nums.length-k;
        for(int i=0;i<k;i++){
            arr[i]=nums[st];
            st++;
        }
        for(int i=k;i<nums.length;i++){
            arr[i]=nums[i-k];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}