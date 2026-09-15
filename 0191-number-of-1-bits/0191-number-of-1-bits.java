class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
            if(n%2!=0)c++;
            n/=2;
        }
        return c;
    }
}