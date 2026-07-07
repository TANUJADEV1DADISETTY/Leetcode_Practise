class Solution {
    public long sumAndMultiply(int n) {
        long rev = 0;
        long sum = 0;
        while(n > 0) {
            long rem = n % 10;
            if(rem != 0) {
                rev = rev * 10 + rem;
                sum = sum + rem;
            }
            n /= 10;
        }

        long digit = 0;
        while(rev > 0) {
            long rem = rev % 10;
            digit = digit * 10 + rem;
            rev /= 10;
        }
        return digit * sum;
    }
}