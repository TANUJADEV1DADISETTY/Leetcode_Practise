class Solution {
    public int[] numberGame(int[] nums) {
        int[] res = new int[nums.length];
        int index = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i+= 2) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            res[index++] = nums[i];
            res[index++] = nums[i+1];
        }

        return res;
    }
}