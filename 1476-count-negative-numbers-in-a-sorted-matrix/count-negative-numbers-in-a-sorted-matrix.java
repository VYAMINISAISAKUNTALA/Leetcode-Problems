class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        for(int[] row:grid){
            ans+=negatives(row);
        }
        return ans;
    }

    public int negatives(int[] nums){
        int left=0, right=nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < 0){
                right=mid;
            }else{
                left =mid+1;
            }
        }
        return nums.length-left;
    }
}