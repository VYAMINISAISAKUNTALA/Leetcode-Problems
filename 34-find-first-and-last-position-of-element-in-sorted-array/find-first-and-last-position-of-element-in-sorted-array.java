class Solution {

    public static int leftBinarySearch(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left <= right){
            int mid = left + (right- left)/2;
            if(nums[mid] == target){
                ans=mid;
                right=mid-1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right= mid -1;
            }
        }
        return ans;
    }

     public static int rightBinarySearch(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left <= right){
            int mid = left + (right- left)/2;
            if(nums[mid] == target){
                ans=mid;
                left=mid+ 1;
            }else if( target > nums[mid]){
                left = mid + 1;
            }else{
                right= mid -1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int left= leftBinarySearch(nums,target);
        int right=rightBinarySearch(nums, target);
        return new int[]{left,right};
        
    }
}