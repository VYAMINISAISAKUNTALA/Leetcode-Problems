class Solution {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length;
        int[] prefixSumArr = new int[size];

        int count=0;

        prefixSumArr[0]=nums[0];    
        for(int i=1;i<size;i++){
            prefixSumArr[i]=prefixSumArr[i-1]+nums[i];
        }

        HashMap<Integer,Integer> hm= new HashMap<>();

        // for(int i=0;i<size;i++){
        //     hm.put(prefixSumArr[i],hm.getOrDefault(prefixSumArr[i],0)+1);
        // }
        hm.put(0,1);
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];;
            if(hm.containsKey(sum - k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}