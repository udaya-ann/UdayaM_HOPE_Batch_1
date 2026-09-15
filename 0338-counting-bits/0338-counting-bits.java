class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        
        for(int i=0;i<=n;i++){
            int count=0;
            int m=i;
            while(m!=0){
                count+=m&1;
                m>>>=1;
            }
            arr[i]=count;
        }
        return arr;
    }
}