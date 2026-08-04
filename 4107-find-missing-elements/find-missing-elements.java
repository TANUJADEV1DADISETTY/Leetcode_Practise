class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int min = nums[0];
        int max = nums[nums.length - 1];
        for(int i = min; i <= max; i++) {
            if(!map.containsKey(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}