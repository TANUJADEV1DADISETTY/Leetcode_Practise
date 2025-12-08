class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                for(int k = 0; k <= j; k++) {
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}