class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                res[index++] = nums[i];
            }
        }
        return res;
    }
}