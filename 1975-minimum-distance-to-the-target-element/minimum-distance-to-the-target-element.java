class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int ans = 0;
            if(nums[i] == target) {
                ans = Math.abs(i-start);
                min = Math.min(min, ans);
            }
        }
        return min;
    }
}