class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 1 && nums[0] < 0){
            return 1;
        }

        HashMap<Long,Long> hm=new HashMap<>();
        long max=Long.MIN_VALUE;
        for(long j: nums){
            hm.put(j,hm.getOrDefault(j, Long.valueOf(0))+1);
            max=Math.max(max,j);
        }
        if(max < 0) { max*=-1;}
        for(long i=1;i<=max+1;i++){
            if(!hm.containsKey(i)){
                return (int) i;
            }
        }
        return (int) max;
    }
}