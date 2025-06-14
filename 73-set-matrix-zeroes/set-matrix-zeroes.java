class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> rows= new ArrayList<>(Collections.nCopies(n,0));
        List<Integer> cols = new ArrayList<>(Collections.nCopies(m,0));

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    rows.set(i,1);
                    cols.set(j,1);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rows.get(i) == 1 || cols.get(j) == 1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}