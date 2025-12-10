class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] res = new int[nums.length];

        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for(int i = 1; i < leftSum.length; i++) {
            leftSum[i] = leftSum[i-1] + nums[i - 1];
        }
        for(int j = rightSum.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j + 1];
        }
        for(int i = 0; i < res.length; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}