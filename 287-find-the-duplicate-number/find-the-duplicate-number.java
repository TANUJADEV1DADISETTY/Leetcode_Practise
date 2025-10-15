class Solution {
    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
            
        }

        return 0;
    }
}