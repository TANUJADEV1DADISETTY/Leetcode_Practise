class Solution {
    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    static int primes(int n) {
        int count = 0;
        while(n > 0) {
            int digit = n % 2;
            if(digit == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i<=right; i++) {
            int set = primes(i);
            if(isPrime(set)) {
                count++;
            }
        }
        return count;
    }
}