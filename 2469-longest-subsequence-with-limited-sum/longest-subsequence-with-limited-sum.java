class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];

        Arrays.sort(nums);
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

       for(int i = 0; i < queries.length; i++) {
            int low = 0;
            int high = nums.length - 1;
            int ans = 0;
            while(low <= high) {
                int mid = (low+high) / 2;
                if(prefix[mid] <= queries[i]) {
                    ans = mid + 1;
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
            answer[i] = ans;
       }
        
        return answer;
    }
}