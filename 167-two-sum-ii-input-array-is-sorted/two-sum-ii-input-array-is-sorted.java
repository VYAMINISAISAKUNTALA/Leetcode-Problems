class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int numbersLength=numbers.length;

        int leftPointer=0, rightPointer=numbersLength-1;

        while(leftPointer< rightPointer){

            int sum = numbers[leftPointer] + numbers[rightPointer];

            if(sum == target){
                return new int[]{leftPointer+1, rightPointer+1};
            }else if(sum < target)
                leftPointer++;
            else rightPointer--;
        }
        return new int[]{-1,-1};
    }
}