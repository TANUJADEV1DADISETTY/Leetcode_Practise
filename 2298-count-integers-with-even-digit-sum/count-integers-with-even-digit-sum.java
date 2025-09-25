class Solution {

    public int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if(digitSum(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}