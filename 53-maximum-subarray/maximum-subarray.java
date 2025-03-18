class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,n=nums.length,max=Integer.MIN_VALUE;
        if(n < 2){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
}