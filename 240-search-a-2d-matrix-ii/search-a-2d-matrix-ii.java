class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows= matrix.length;
        int cols=matrix[0].length;

        int left = 0, right = cols-1;

        while (left < rows && right >=0){
        
            if(matrix[left][right]  == target) 
                return true;
            else if(matrix[left][right] < target) 
                left++;
            else 
                right--;

        }
        return false;
    }
}