class Solution {
    public double minimumAverage(int[] nums) {
        double[] res = new double[nums.length / 2];
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            res[i] = (nums[i] + nums[j])/2.0;
            i++;
            j--;
        }

        double min = Integer.MAX_VALUE;
        for(int k = 0; k < res.length; k++) {
            if(res[k] < min) {
                min = res[k];
            }
        }
        return min;
    }
}