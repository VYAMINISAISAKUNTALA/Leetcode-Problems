class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int len = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();

        // for(int num : nums){
        // }

        for(int num:nums){
            if(hm.containsKey(num)){
                return true;
            }
            hm.put(num, hm.getOrDefault(num,0)+1);

        }
        return false;
    }
}