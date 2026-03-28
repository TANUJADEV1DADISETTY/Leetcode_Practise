class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            String binary = Integer.toBinaryString(i);
            int cnt = 0;
            for(int j = 0; j < binary.length(); j++) {
                if(binary.charAt(j) == '1') {
                    cnt++;
                }
            }
            if(cnt == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}