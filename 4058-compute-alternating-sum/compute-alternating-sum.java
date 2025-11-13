class Solution {
    public int alternatingSum(int[] nums) {
        int even_sum = 0;
        int odd_sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                even_sum += nums[i];
            }
            else {
                odd_sum += nums[i];
            }
        }
        int res = even_sum - odd_sum;
        return res;
    }
}