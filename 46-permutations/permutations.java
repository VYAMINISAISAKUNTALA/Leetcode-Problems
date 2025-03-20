class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        helper(nums,new ArrayList<Integer>());
        return ans;

    }
    public void helper(int[] arr,List<Integer> used){
        if(used.size() == arr.length){
            ans.add(new ArrayList<>(used));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!used.contains(arr[i])){
                used.add(arr[i]);
                helper(arr,used);
                used.removeLast();
            }
        }
    }
} 