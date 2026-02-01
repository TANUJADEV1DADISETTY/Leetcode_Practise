class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int[] ans = new int[nums.length - 1];
        int index = 0;
        for(int i = 1; i < nums.length; i++) {
            ans[index++] = nums[i];
        }

        Arrays.sort(ans);

        sum = sum + ans[0] + ans[1];

        return sum;
        
    }
}