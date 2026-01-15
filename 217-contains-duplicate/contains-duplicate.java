class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int len = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            if(hm.containsKey(num) && hm.get(num) >=2){
                return true;
            }
        }
        return false;
    }
}