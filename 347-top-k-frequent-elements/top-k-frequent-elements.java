class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();

        int n=nums.length;
        for(int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        List<Integer>[] freq=new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            int frequency=entry.getValue();
            freq[frequency].add(entry.getKey());
        }
        int[] arr=new int[k];
        int index=0;
        for(int i=n;i>=0;i--){
            for(int j:freq[i]){
                arr[index++]=j;
                if(index == k){
                    return arr;
                }
            }
        }
        return new int[0];


    }
}