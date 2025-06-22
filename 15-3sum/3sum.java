class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;

        List<List<Integer>> triplets = new ArrayList<>();
        List<Integer> triplet = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<len;i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = len-1;

                while(left < right){
                    triplet = new ArrayList<>();
                    if(nums[i] + nums[left] + nums[right] == 0){
                        triplet.add(nums[i]);
                        triplet.add(nums[left]);
                        triplet.add(nums[right]);
                        triplets.add(triplet);
                        left++;
                        right--; 
                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right+1]) right--;

                    }else if(nums[i] + nums[left] + nums[right] < 0){
                        left++;
                    }else{
                        right--;
                    }

                }
            }
                    return triplets;
            
        }
}
