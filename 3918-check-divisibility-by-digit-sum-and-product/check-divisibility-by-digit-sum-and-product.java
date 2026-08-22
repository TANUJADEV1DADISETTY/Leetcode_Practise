class Solution {

    public int[] digitSum(int n) {
        int sum = 0;
        int pro = 1;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            pro *= rem;
            n /= 10;
        }
        return new int[]{sum, pro};
    }
    public boolean checkDivisibility(int n) {
        int[] ans = digitSum(n);
        int sum = ans[0];
        int pro = ans[1];

        int total = sum + pro;

        if(n % total == 0) {
            return true;
        }
        return false;
    }
}