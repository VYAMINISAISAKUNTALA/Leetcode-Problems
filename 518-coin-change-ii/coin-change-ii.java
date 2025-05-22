class Solution {
    public int change(int amount, int[] coins) {
        

        int n=coins.length;
        //no of ways uisng i coins to make amount j
        //if you don't have any coins can u make any amount ?? 0 way
        // you have coins but the amount is 0? 1 way 
        int[][] dp = new int[n+1][amount+1];

        //row
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }

        //col
        for(int i=0;i<=amount;i++){
            dp[0][i]=0;
        }
        //if denomination is less than amount
        for(int i=1;i<=n;i++){
            for(int j=1; j<= amount;j++){
                if(coins[i-1] <= j){
                    int pick =dp[i][j-coins[i-1]]; 
                    int notPick =dp[i-1][j];
                    int totalWays = pick + notPick;
                    dp[i][j] = totalWays;
                }else{
                    int notPick = dp[i-1][j];
                    dp[i][j]=notPick;
                }
            }
        }

        return dp[n][amount];

    }
}