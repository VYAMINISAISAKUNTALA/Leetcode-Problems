class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rowSize=matrix.length;
        int colSize=matrix[0].length;
        int rowBegin=0;
        int rowEnd=rowSize-1;
        int colBegin=0;
        int colEnd=colSize-1;
        List<Integer> sMatrix=new ArrayList<>();

        while(rowBegin <= rowEnd && colBegin <= colEnd){

            //traverse right
            for(int i=colBegin;i<=colEnd;i++){
                sMatrix.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            //traverseDown
            for(int j=rowBegin;j<=rowEnd;j++){
                sMatrix.add(matrix[j][colEnd]);
            }
            colEnd--;

            //traverseLeft
            if(rowBegin <= rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    sMatrix.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //traverseUp
            if(colBegin<=colEnd){
                for(int j=rowEnd;j>=rowBegin;j--){
                    sMatrix.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return sMatrix;













        // int rows=matrix.length;
        // int cols=matrix[0].length;
        // int top=0;
        // int bottom=rows-1;
        // int left=0;
        // int right=cols-1;
        // List<Integer> ans=new ArrayList<>();
        // while(ans.size() < rows * cols){

        //     for(int i=left;i<=right && ans.size() < rows * cols;i++){   
        //         ans.add(matrix[top][i]);
        //     }
        //     top++;

            
        //     for(int i=top;i<=bottom && ans.size() < rows * cols;i++){   
        //         ans.add(matrix[i][right]);
        //     }
        //     right--;

    
        //     for(int i=right;i>=left && ans.size() < rows * cols;i--){   
        //         ans.add(matrix[bottom][i]);
        //     }
        //     bottom--;

            
        //     for(int i=bottom;i>=top && ans.size() < rows * cols;i--){   
        //         ans.add(matrix[i][left]);
        //     }
        //     left++;

        // }
        // return ans;
    }
}