class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1) {
            return 0;
        }
        
        Arrays.sort(nums);
        int i = nums.length - 1;
        int cnt = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(cnt != k) {
            ans.add(nums[i]);
            i--;
            cnt++;
        }
        
        
        int sum = ans.get(0) - ans.get(ans.size() - 1);
        
        for(int j = nums.length - k - 1; j >= 0; j--) {
            ans.remove(0);
            ans.add(nums[j]);
            sum = Math.min(sum, ans.get(0) - ans.get(ans.size() - 1));
        }
        return sum;
    }
}