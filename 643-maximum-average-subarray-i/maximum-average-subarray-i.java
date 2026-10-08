class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        double max = -Double.MAX_VALUE;
        while(right < nums.length) {
            sum += nums[right];
            while(right - left + 1 > k) {
                sum -= nums[left];
                left++;
            }
            if(right - left + 1 == k) {
                double avg = (double) sum / k;
                max = Math.max(max, avg);
            }
            right++;
        }
        return max;
    }
}