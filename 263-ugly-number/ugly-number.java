class Solution {
    public boolean isUgly(int n) {

        if(n <= 0) return false;
        while(n % 2 == 0){
            n/=2;
        }
        while(n % 3 == 0){
            n/=3;
        }
        while(n % 5 == 0){
            n/=5;
        }
        if(n > 5){
            return false;
        }
        return true;
        
        // if(n == 1){
        //     return true;
        // }
        // return primeFactors(n);
    }

    public boolean primeFactors(int n){
        while(n % 2 == 0){
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n % i == 0){
                if(i > 5){
                    return false;
                }
                n/=i;
            }            
        }
        if(n > 5){
            return false;
        }
        return true;

    }


}