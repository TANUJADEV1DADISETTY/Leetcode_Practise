class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] freq = new int[51];

        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        System.out.print(Arrays.toString(freq));
        int xor = 0;

        for(int i = 1; i < freq.length; i++) {
            if(freq[i] == 2) {
                xor = xor ^ i;
            }
        }
        return xor;
    }
}