class Solution {
    public int subarraySum(int[] nums) {
        int prefix_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = Math.max(0, (i - nums[i])); j <= i; j++) {
                sum = sum + nums[j];
            }
            prefix_sum = prefix_sum + sum;
        }
        return prefix_sum;
    }
}