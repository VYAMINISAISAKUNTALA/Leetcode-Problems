class Solution {
    static List<List<Integer>> subset;
    public List<List<Integer>> subsets(int[] nums) {
        subset=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>());
        return subset;
    }

    static void backtrack(int[] nums, int index, List<Integer> current){
        subset.add(new ArrayList<>(current));

        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(nums,i+1,current);
            current.remove(current.size()-1);
        }
    }
}