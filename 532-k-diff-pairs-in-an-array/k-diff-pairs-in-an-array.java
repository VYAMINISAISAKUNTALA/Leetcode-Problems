class Solution {
    public int findPairs(int[] nums, int k) {
        int len=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int num:nums){
            hs.put(num,hs.getOrDefault(num,0)+1);  
        }
        int count=0;
        for(int i:hs.keySet()){
           
            if(k > 0 && hs.containsKey(i + k) || k==0 && hs.get(i) > 1){
                count++;
            }
        }

        return count;
    }
}