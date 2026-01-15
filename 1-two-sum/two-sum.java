class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int len = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<len;i++){
            int component = target - nums[i];
            if(hm.containsKey(component) && i!=hm.get(component)){
                return new int[]{i, hm.get(component)};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
            
    }
}