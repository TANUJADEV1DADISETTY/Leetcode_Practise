class Solution {
    public int maxNum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public int firstUniqueFreq(int[] nums) {
        int size = maxNum(nums) + 1;
        int[] freq = new int[size];

        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int newsize = maxNum(freq) + 1;

        int[] f = new int[newsize];

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                f[freq[i]]++;
            }
        }

        
        for(int i = 0; i < nums.length; i++) {
            if(f[freq[nums[i]]] == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}