class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] p = new long[nums.length];
        p[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            p[i] = p[i - 1] + nums[i];
        }
        int cnt = 0;

        for(int i = 0; i < p.length - 1; i++) {
            long sum1 = p[p.length - 1] - p[i];
            if(p[i] >= sum1) {
                cnt++;
            }
        }
        return cnt;
    }
}