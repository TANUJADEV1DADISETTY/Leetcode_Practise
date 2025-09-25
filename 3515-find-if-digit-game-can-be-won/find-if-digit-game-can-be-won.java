class Solution {

    public int digitCount(int n) {
        int count = 0;
        while(n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(digitCount(nums[i]) == 1) {
                sum = sum + nums[i];
            }
            else {
                sum1 = sum1 + nums[i];
            }
        }
        if(sum != sum1) {
            return true;
        }
        else {
            return false;
        }
    }
}