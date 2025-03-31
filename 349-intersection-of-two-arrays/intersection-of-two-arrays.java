class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int num:nums1){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && !(list.contains(nums2[i]))){
                list.add(nums2[i]);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;

    }
}