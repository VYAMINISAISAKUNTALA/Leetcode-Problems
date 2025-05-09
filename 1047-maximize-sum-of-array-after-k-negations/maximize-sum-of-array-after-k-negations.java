class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int maxSum=0;
        for(int num:nums){
            pq.add(num);
        }
        int i=0;
        while(i < k){
            int val= pq.peek() * -1;
            pq.poll();
            pq.add(val);
            i++;
        }
        
        for(int num:pq){
            maxSum+=num;
        }
        return maxSum;



    }
}