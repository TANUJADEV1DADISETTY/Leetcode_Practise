class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int prefixSum = nums[0];
        int cnt = 0;
        for(int i = 1; i < nums.length; i++) {
            prefixSum = prefixSum + nums[i];
            if(prefixSum == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}