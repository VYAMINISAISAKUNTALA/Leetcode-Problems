class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        List<List<Integer>> result = new ArrayList<>();

        if(nums1.length == 0 || nums2.length == 0){
            return result;
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        Set<String> visited = new HashSet<>();

        minHeap.add(new int[]{0, 0, (nums1[0] + nums2[0])});
        visited.add("0,0");

        while(!minHeap.isEmpty() && k -- > 0){

            int[] current = minHeap.poll();

            int i = current[0];
            int j = current[1];

            result.add(List.of(nums1[i] , nums2[j]));

            if(i + 1 < nums1.length && !visited.contains((i+1) +"," + j)){
                minHeap.add(new int[]{i+1, j , (nums1[i+1] + nums2[j])});
                visited.add((i+1) + ","+j);
            }

            if(j + 1 < nums2.length && !visited.contains(i+","+(j+1))){
                minHeap.add(new int[]{i , j + 1, (nums1[i] + nums2[j+1])});
                visited.add(i+","+(j+1));
            }
        }
        return result;
        
    }
}