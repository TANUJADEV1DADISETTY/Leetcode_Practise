class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                ans = nums[i];
            }
        }
        return ans;
    }
}