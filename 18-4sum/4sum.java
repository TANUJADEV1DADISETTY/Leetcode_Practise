class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            else {
                for(int j = i+1; j < nums.length - 2; j++) {
                    if(j > i + 1 && nums[j] == nums[j-1]) {
                        continue;
                    }
                    else {
                        int l = j+1;
                        int r = nums.length - 1;
                        while(l < r) {
                            long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                            List<Integer> lst = new ArrayList<>();
                            if(sum == target) {
                                lst.add(nums[i]);
                                lst.add(nums[j]);
                                lst.add(nums[l]);
                                lst.add(nums[r]);
                                l++;
                                r--;
                                while(l < r && nums[l] == nums[l-1]) {
                                    l++;
                                }
                                while(l < r && nums[r] == nums[r+1]) {
                                    r--;
                                }
                                ans.add(lst);
                            }
                            else if(sum > target) {
                                r--;
                            }
                            else {
                                l++;
                            }
                            //ans.add(lst);
                        }
                    }
                }
            }
        }
        return ans;
    }
}