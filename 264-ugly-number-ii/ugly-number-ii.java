class Solution {
    public int nthUglyNumber(int n) {

        if(n == 1) return 1;
        List<Integer> uglyNumber = new ArrayList<>();

        int num2=0, num3 =0, num5=0;

        uglyNumber.add(1);
        while(uglyNumber.size() < n){
            int min = Math.min(uglyNumber.get(num2) * 2 ,Math.min(uglyNumber.get(num3) * 3 , uglyNumber.get(num5) * 5));
            uglyNumber.add(min);    
            if(min ==uglyNumber.get(num2) * 2){
                num2++;
            }if(min ==uglyNumber.get(num3) * 3){
                num3++;
            }if(min ==uglyNumber.get(num5) * 5){
                num5++;
            }
        }
        return uglyNumber.get(uglyNumber.size()-1);
        

    }
    //     PriorityQueue<Integer> minH= new PriorityQueue<>(Collections.reverseOrder());
    //     if(n == 1) return 1;
    //     int count=0,num=2;
    //     minH.add(1);
    //     while(count!=n-1){

    //         if(primeFactor(num)){
    //             count++;
    //             minH.add(num);
    //         }
    //         num++;
    //     }
    //     return minH.peek();


    // }

    // static boolean primeFactor(int n){

    //     List<Integer> list= new ArrayList<>();

      
    //     while(n % 2 == 0){
    //         list.add(2);
    //         n/=2;
    //     }

    //     for(int i=3;i*i<=n;i+=2){
    //         while(n % i == 0){
    //             list.add(i);
    //             n/=i;
    //         }
    //     }

    //     if(n > 2){
    //         list.add(n);
    //     }
    //     for(int i=0;i<list.size();i++){
    //         if(list.get(i) > 5){
    //              return false;
    //         }
    //     }
    //     return true;

    // }
}