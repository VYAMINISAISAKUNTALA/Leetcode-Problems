class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
         minHeap = new PriorityQueue<>(k);
        for(int i=0;i<nums.length;i++){
            if(minHeap.size() < k){
                minHeap.add(nums[i]);
            }else if(minHeap.peek() < nums[i]){
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
    
        
    }
    
    public int add(int val) {
         if (minHeap.size() < k) {
        // Heap is not full yet, so just add
        minHeap.add(val);
    } else if (val > minHeap.peek()) {
        // val is bigger than the smallest in heap (kth largest)
        minHeap.poll();       // remove the smallest
        minHeap.add(val);     // add the new value
    }
    // kth largest is always at the top
    return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */