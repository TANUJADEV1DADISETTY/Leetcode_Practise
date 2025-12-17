class Solution {
    public int sumOfUnique(int[] nums) {
        // ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int cnt = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
           for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    cnt++;
                }
           }
           if(cnt == 1) {
                sum = sum + nums[i];
           }
           cnt = 0;
        }
        return sum;
    }
}