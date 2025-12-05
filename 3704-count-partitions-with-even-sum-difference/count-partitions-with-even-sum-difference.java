class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 0;
        int sumLeft = 0;
        while(i < n - 1) {
            sumLeft += nums[i];
            int sumRight = 0;
            for(int j = i + 1; j < n; j++) {
                sumRight += nums[j];
            }
            if(Math.abs(sumLeft - sumRight) % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}