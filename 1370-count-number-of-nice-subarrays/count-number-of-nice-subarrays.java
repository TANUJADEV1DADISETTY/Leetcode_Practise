class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int right = 0;
        int oddCnt = 0;
        int subCnt = 0;
        int cnt = 0;
        for(int left = 0; left < nums.length; left++) {
            if(nums[left] % 2 != 0) {
                oddCnt++;
                cnt = 0;
            }
            while(oddCnt == k) {
                cnt++;
                if(nums[right] % 2 != 0) {
                    oddCnt -= 1;
                }
                right++;
            }
            subCnt += cnt;
        }
        return subCnt;
    }
}