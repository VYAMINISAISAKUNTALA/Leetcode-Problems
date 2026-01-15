class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int len = nums.length;

        for(int i=1;i<=len;i++){
            ans = ans ^ i;
        }
        for(int i=0;i<len;i++){
            ans = ans ^ nums[i];
        }

        return ans;
    }
}