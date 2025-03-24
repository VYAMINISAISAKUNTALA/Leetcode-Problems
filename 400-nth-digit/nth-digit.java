class Solution {
    public int findNthDigit(int n) {
        long digitCount=1;
        long start=1;
        long count=9;
        long no=n;

        while(no > digitCount * count){
            no= no- digitCount*count;
            digitCount++;
            start*=10;
            count*=10;
        }
        long number=start + (no-1)/digitCount;
        String num = String.valueOf(number);
        System.out.println(num);
        return Integer.valueOf(num.charAt((int)((no - 1) % digitCount)) - '0');
    }
}