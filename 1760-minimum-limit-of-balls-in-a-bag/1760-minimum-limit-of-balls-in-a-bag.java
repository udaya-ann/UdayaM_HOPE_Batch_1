class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1,r=0;
        for(int x:nums)
            r=Math.max(r,x);

        while(l<r){
            int m=(l+r)/2;
            int op=0;

            for(int x:nums)
                op+=(x-1)/m;

            if(op<=maxOperations)
                r=m;
            else
                l=m+1;
        }

        return l;
    }
}