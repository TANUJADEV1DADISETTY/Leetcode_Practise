class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue || (entry.getValue() == maxValue && entry.getKey() < maxKey)) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}