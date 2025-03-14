class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n=nums.length;
        int ans=0,idx=0;
        List<Integer> num=new ArrayList<>();
        boolean even=false;
        for(int i=0;i<n;i++){
            if(nums[i] % 2 == 0){
                num.add(nums[i]);
            }
        }
        if(num.size() < 2){
            return false;
        }
         for(int i=0;i<num.size();i++){
            ans|=num.get(i);
        }

        if(((ans >> 0) & 1) == 0){
            return true;
        }
        return false;
        
    }
}