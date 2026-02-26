class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] freq = new int[101];

        for(int i = 0; i < nums.size(); i++) {
            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);
            for(int j = start; j <= end; j++) {
                freq[j]++;
            }
        }
        int cnt = 0;
        for(int i = 1; i < freq.length; i++) {
            if(freq[i] != 0) {
                cnt++;
                // break;
            }
        }
        return cnt;
    }
}