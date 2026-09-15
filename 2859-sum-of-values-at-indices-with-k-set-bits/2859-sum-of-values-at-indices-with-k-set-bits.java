class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int count=0;
            int x=i;
            while(x!=0){
                count+=x&1;
                x>>>=1;
            }
            if(count==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}