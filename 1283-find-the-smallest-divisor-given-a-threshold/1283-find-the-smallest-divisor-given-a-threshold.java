class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int n:nums){
            right=Math.max(right,n);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int n:nums){
                sum+=(n+mid-1)/mid;
            }
            if(sum<=threshold){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}