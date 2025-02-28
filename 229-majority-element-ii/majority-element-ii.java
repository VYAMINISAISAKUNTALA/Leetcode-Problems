class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        for(int j:nums){
            hm.put(j,hm.getOrDefault(j,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue() > (n/3)){
                li.add(entry.getKey());
            }
        }
        return li;


    }
}