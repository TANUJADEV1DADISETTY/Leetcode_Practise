class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] res = new int[nums.length];
    //    int index = 0;
       int cnt = 0;
       for(int i = 0; i < nums.length; i++) {
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] < nums[i]) {
                cnt++;
            }
        }
        res[i] = cnt;
        cnt = 0;
       }
       return res;
    }
}