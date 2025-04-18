class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength=0,length;
        int n=nums.length;

        if(n == 1) return 1;
        HashSet<Integer> hs= new HashSet<>();

        for(int num:nums){
            hs.add(num);
        }
        int startNumber=0;

        for(int num:hs){
            length=0;
            if(!hs.contains(num - 1)){
                startNumber=num;
                while(hs.contains(startNumber++)){
                    length++;
                }
            }
            maxLength=Math.max(maxLength,length);
        }

        
        return maxLength;
    }
}