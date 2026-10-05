class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1) return 0;
        grid[0][0]=1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)continue;
                if(grid[i][j]==1) grid[i][j]=0;
                else if(i==0) grid[i][j]=grid[i][j-1];
                else if(j==0) grid[i][j]=grid[i-1][j];
                else{
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }


        return grid[m-1][n-1];
    }
}