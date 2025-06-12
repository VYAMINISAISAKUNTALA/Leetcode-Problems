class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        int count=0;

        Arrays.sort(nums);
        
        for(int back = n-1; back >= 2;back--){
            int left=0;
            int right = back-1;

            while(left < right){
                if(nums[left] + nums[right] > nums[back]){
                    count+= right - left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
}