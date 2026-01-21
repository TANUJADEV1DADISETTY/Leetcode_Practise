class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);

            if((num % 2) == 0) {
                ans[i] = -1;
                continue;
            }

            int temp = num;
            int cnt = 0;

            while((temp & 1) == 1) {
                cnt++;
                temp >>= 1;
            }

            ans[i] = num - (int)Math.pow(2, (cnt-1));
        }
        return ans;
    }
}