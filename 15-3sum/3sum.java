class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                List<Integer> lists = new ArrayList<>();
                if(sum == 0) {
                    lists.add(nums[i]);
                    lists.add(nums[j]);
                    lists.add(nums[k]);
                    j++;
                    k--;
                    set.add(lists);
                }

                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
       
        return ans;
    }
}