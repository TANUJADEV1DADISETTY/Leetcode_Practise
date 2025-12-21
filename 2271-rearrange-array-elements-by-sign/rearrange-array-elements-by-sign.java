class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length / 2];
        int p = 0;
        int n = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0) {
                pos[p++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                neg[n++] = nums[i];
            }
        }
        int[] res = new int[nums.length];
        int pi = 0;
        int ni = 0;
        for(int i = 0; i < res.length; i++) {
            if(i % 2 == 0) {
                res[i] = pos[pi++];
            }
            else {
                res[i] = neg[ni++];
            }
        }
        return res;
    }
}