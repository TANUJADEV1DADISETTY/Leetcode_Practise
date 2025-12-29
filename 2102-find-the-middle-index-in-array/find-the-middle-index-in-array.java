class Solution {
    public int findMiddleIndex(int[] nums) {
        int middle = 0;
        while(middle < nums.length) {
            int lsum = 0;
            int rsum = 0;
            for(int i = 0; i < middle; i++) {
                lsum += nums[i];
            }
            for(int i = middle + 1; i < nums.length; i++) {
                rsum += nums[i];
            }
            if(lsum == rsum) {
                return middle;
            }
            middle++;
        }
        return -1;
    }
}