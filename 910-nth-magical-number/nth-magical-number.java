class Solution {

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    public int nthMagicalNumber(int n, int a, int b) {
        long l = Math.min(a, b), r = l * n;
        long ans = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            if ((mid / a) + (mid / b) - (mid / lcm(a, b)) < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return (int) (ans % 1000000007);
    }
}