class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ans=new ArrayList<>();
        helper(nums,new ArrayList<Integer>(),new boolean[nums.length]);
        return ans;
    }
    public void helper(int[] arr,List<Integer> used, boolean visited[]){
        if(arr.length == used.size()){
            ans.add(new ArrayList<>(used));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(visited[i] || (!visited[i] && i > 0 && arr[i] == arr[i-1] && !visited[i-1]))
                continue;
            visited[i] = true;
            used.add(arr[i]);
            helper(arr,used,visited);
            used.remove(used.size()-1);
            visited[i]=false;
        }
    }

}