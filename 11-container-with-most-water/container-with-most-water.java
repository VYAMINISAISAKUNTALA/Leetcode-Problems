class Solution {
    public int maxArea(int[] height) {
        
        int n= height.length;

        int left=0;
        int right=n-1;

        int maxArea=-1;

        while(left < right){

            int wHeight = Math.min(height[left] , height[right]);

            int width = right - left;

            maxArea = Math.max(wHeight * width, maxArea);

            if (wHeight == height[left]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;


    }
}