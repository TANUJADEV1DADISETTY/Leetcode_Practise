class Solution {
    public int maxEle(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public int minMoves(int[] nums) {
        int max = maxEle(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        
        int res = (nums.length * max) - sum;
        return res;
    }
}