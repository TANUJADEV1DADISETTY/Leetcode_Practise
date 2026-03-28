class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int idx = 0;
        for(int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            int cnt = 0;
            for(int j = 0; j < binary.length(); j++) {
                if(binary.charAt(j) == '1') {
                    cnt++;
                }
            }
            ans[idx++] = cnt;
        }
        return ans;
    }
}