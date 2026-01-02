class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            int cnt = 0;
            if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
                cnt ++;
            }
            else {
                return nums[i];
            }
            i += 3;
        }
        return nums[nums.length - 1];
    }
}