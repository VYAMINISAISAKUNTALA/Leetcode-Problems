class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int index,n=nums.length;
        if(n == 1){
            return target == nums[0]? 0 : -1;
        }
        if(target >= nums[pivot] && target <= nums[n-1]){
            index = binarySearch(nums,pivot,n-1,target);
        }else{
            index = binarySearch(nums,0,pivot-1, target);
        }
        return index;
        
    }

    static int findPivot(int[] nums){
        int left=0,right=nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] <= nums[right]){
                right=mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }

    static int binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}