class Solution {
    public int maxDigitRange(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int num = nums[i];
            while(num > 0) {
                int rem = num % 10;
                max = Math.max(rem, max);
                min = Math.min(rem, min);
                num /= 10;
            }
            res[i] = max - min;
        }

        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < res.length; i++) {
            if(res[i] > maxEle) {
                maxEle = res[i];
            }
        }

        int sum = 0;
        for(int i = 0; i < res.length; i++) {
            if(res[i] == maxEle) {
                sum += nums[i];
            }
        }
        return sum;
    }
}