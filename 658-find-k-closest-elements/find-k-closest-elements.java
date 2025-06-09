class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = n-1;

        
        while(left < right){

            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);
            
            if(right - left == k - 1) break;

            if(leftDiff > rightDiff){
                left++;
            }else{
                right--;
            }
            
        }

        for(int i=left;i<=right;i++){
            list.add(arr[i]);
        }
        return list;
        
    }
}