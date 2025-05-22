class Solution {
    public int uniquePaths(int m, int n) {
        

        int[][] dp= new int[m][n];

        //dp[i][j] -> number of ways by which i can reach cell n,m from i ,j

        for(int i=m-1;i>=0;i--){
            dp[i][n-1]=1; // there is only 1 way to move down
        }

        for(int i=n-1;i>=0;i--){
            dp[m-1][i]=1; // there is only 1 way to reach right
        }
        for(int i=m-2;i>=0;i--){ // 2nd last row starting
            for(int j=n-2;j>=0;j--){ //2nd last col starting
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        return dp[0][0];

    }
}