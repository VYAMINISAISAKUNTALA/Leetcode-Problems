class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> kThLargestElement = new PriorityQueue<>();

        for(int num:nums){
            if(kThLargestElement.size() < k){
                kThLargestElement.add(num);
            }
            else if(kThLargestElement.peek() < num){
                kThLargestElement.poll();
                kThLargestElement.add(num);
            }
        }

        return kThLargestElement.peek();

    }
}