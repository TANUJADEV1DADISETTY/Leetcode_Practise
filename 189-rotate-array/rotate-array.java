class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];

        k = k % nums.length; 
            int i = 0;
            int j = nums.length - k;
            int idx = 0;
            while(j < nums.length) {
                ans[idx++] = nums[j];
                j++;
            }
            while(i < nums.length - k) {
                ans[idx++] = nums[i];
                i++;
            }

        for(int x = 0; x < ans.length; x++) {
            nums[x] = ans[x];
        }
    }
}