class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans=0;

        if(nums2.length%2==1){
            for(int num:nums1){
                ans^=num;
            }
        }

        if(nums1.length%2==1){
            for(int num:nums2){
                ans^=num;
            }
        }
        return ans;
    }
}