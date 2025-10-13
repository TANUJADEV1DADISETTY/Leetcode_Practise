class Solution {
     public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                res.add(j + 1);
            }
        }
        return res;

    }
}