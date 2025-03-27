class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        helper(nums,new ArrayList<>());
        return ans;
    }

     public void helper(int[] nums,List<Integer> used){

        if(nums.length == used.size()){
            ans.add(new ArrayList<>(used));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!used.contains(nums[i])){
                used.add(nums[i]);
                helper(nums, used);
                used.remove(used.size()-1);
            }
        }
     }
} 