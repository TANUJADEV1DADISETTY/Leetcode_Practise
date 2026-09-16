class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        for(int i = 0; i < nums.length; i++) {
            if(freq[nums[i]] == 0) {
                freq[nums[i]] = 1;
            }
            else {
                freq[nums[i]] = 0;
            }
        }
        System.out.println(Arrays.toString(freq));
        int cnt = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == 1) {
                cnt++;
            }
        }
        return new int[]{(nums.length - cnt)/2, cnt};
    }
}