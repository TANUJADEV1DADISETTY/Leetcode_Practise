class Solution {
    public int minimumPrefixLength(int[] nums) {
        int j = nums.length - 1;
        int cnt = 1;
        while(j > 0 && nums[j] > nums[j - 1]) {
            cnt++;
            j--;
        }

        int ans = nums.length - cnt;
        return ans;
    }
}