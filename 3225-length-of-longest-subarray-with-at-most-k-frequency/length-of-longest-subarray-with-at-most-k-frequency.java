class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = i;
        int maxcnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while(map.get(nums[j]) > k) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
                i++;
            }
            maxcnt = Math.max(maxcnt, j-i+1);
            j++;
        }
        return maxcnt;
    }
}