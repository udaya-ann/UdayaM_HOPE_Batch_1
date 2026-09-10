class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int l=matrix[0][0],r=matrix[n-1][n-1];

        while(l<r){
            int m=l+(r-l)/2;
            int count=0;
            int row=n-1,col=0;

            while(row>=0&&col<n){
                if(matrix[row][col]<=m){
                    count+=row+1;
                    col++;
                }else{
                    row--;
                }
            }

            if(count>=k)
                r=m;
            else
                l=m+1;
        }

        return l;
    }
}