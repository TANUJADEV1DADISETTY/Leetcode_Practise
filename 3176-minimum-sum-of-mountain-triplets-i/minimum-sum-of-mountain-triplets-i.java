class Solution {
    public int minimumSum(int[] nums) {
        int sum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum1 = 0;
                    if(nums[i] < nums[j] && nums[k] < nums[j]) {
                        sum1 += nums[i] + nums[j] + nums[k];
                        sum = Math.min(sum, sum1);
                    }
                }
            }
        }
        return sum == Integer.MAX_VALUE ? -1 : sum;
    }
}