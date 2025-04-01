class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int numLength=arr.length;
        int leftPointer=0, rightPointer=numLength-1;

        if(numLength == 1 && (arr[0] <= x || arr[0] >= x)){
            return new ArrayList<>(Arrays.asList(1));
        }
        List<Integer> list=new ArrayList<>();

        if(numLength == k){
            for (int num : arr) {
                list.add(num);
            }
            return list;
        }
        while (leftPointer < rightPointer){

            int leftNo = Math.abs(arr[leftPointer] - x);
            int rightNo= Math.abs(arr[rightPointer] - x);
            if(rightPointer - leftPointer == k-1) break;
            if(leftNo > rightNo){
                leftPointer++;
            }else {
                rightPointer--;
            }
        }
        System.out.println(leftPointer+"-"+rightPointer);
        for(int i=leftPointer;i<=rightPointer;i++){
            list.add(arr[i]);
        }
        return list;
    }
}