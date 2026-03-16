class Solution {

    public int digitCount(int n) {
        int cnt = 0;
        while(n != 0) {
            int rem = n % 10;
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    public int countCommas(int n) {
        if(digitCount(n) <= 3) {
            return 0;
        }
        int cnt = 0;
        for(int i = 1000; i <= n; i++) {
            cnt++;
        }
        return cnt;
    }
}