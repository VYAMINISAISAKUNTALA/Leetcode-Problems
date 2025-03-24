class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long ans=0, sign=1;

        if(dividend >= 0 && divisor < 0 || divisor >= 0 && dividend < 0) sign=-1;

        long dd = Math.abs((long) dividend);
        long dr = Math.abs((long) divisor);

        for(int i=31;i>=0;i--){
            if((dr << i) <= dd){
                dd-=(dr << i);
                ans+= (1 << i);
            }
        }

        return (int)(ans * sign);
    }
}