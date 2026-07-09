class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            int water=width*h;
            ans=Math.max(ans,water);
            if(height[left]<height[right])left++;
            else right--;
        }
        return ans;
    }
}