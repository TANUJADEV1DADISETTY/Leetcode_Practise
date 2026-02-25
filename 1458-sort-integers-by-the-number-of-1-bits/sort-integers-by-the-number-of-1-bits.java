class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] nums = new int[arr.length][2];

        for(int i = 0; i < arr.length; i++) {
            
            nums[i][0] = arr[i];
            nums[i][1] = Integer.bitCount(arr[i]);

        }

        Arrays.sort(nums, (a, b) -> {
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int[] ans = new int[arr.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i][0];
        }

        return ans;
    }
}