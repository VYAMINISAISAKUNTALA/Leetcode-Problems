class Solution {

    void dfs(int i, int j, int[][] vis, char[][] grid, int n, int m){
        vis[i][j] = 1;
        int[] X={0,1,0,-1};
        int[] Y={1,0,-1,0};

        for(int k=0;k<4;k++){
            int newX = i + X[k];
            int newY = j + Y[k];
            if(newX >= 0 && newY >= 0 && newX < n && newY < m && grid[newX][newY] == '1' && vis[newX][newY] == 0){
                dfs(newX, newY, vis, grid, n, m);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int numOfIslands = 0;

        int[][] vis= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    numOfIslands++;
                    dfs(i,j,vis,grid,n,m);
                }
            }
        }
        return numOfIslands;
    }
}