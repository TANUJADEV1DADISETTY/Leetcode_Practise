class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] prefix = new int[nums.length];
        
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length;i++){
            prefix[i] = prefix[i-1] ^ nums[i];
        }

        int[] ans = new int[nums.length];

        int idx = 0;
        for(int i = prefix.length - 1; i >= 0; i--) {
            ans[idx++] = prefix[i] ^ (int)Math.pow(2, maximumBit) - 1;
        }

        return ans;
    }
}