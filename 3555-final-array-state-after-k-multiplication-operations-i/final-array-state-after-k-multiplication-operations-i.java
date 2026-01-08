class Solution {
    public int minEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = 1;
        while(n <= k) {
           int min = minEle(nums);
           for(int i = 0; i < nums.length; i++) {
                if(nums[i] == min) {
                    nums[i] = nums[i] * multiplier;
                    break;
                }
                System.out.println(nums[i]);
           }
           n++;
        }
        return nums;
    }
}