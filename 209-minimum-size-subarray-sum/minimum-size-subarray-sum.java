class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int left = 0; left < nums.length; left++) {
            sum += nums[left];
            while(sum >= target) {
                min = Math.min(min, left - right + 1);
                sum -= nums[right];
                right++;
            }
        }
        if(min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}