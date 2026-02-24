class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];

        Arrays.sort(nums);
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        int idx = 0;
        while(idx < queries.length) {
            int ans = 0;
            for(int i = 0; i < prefix.length; i++) {
                if(prefix[i] <= queries[idx]) {
                    ans = i+1;
                }
            }
            answer[idx] = ans;
            idx++;
        }
        
        return answer;
    }
}