class Solution {
    public int nthUglyNumber(int n) {

        int num2=0;
        int num3=0;
        int num5=0;

        List<Integer> uglyNo = new ArrayList<>();
        uglyNo.add(1);

        while(uglyNo.size() < n){

            int mn = Math.min(uglyNo.get(num2) * 2, Math.min(uglyNo.get(num3) * 3 , uglyNo.get(num5) * 5));
            uglyNo.add(mn);
            
            if(mn == uglyNo.get(num2) * 2){
                num2++;
            }
            if(mn == uglyNo.get(num3) * 3){
                num3++;
            }
            if(mn == uglyNo.get(num5) * 5){
                num5++;
            }
        }   
        return uglyNo.get(n-1);
    }
}