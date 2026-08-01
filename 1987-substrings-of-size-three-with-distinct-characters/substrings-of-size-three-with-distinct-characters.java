class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;

        int[] freq = new int[26];
        int distinct = 0;
        int ans = 0;

        // First window
        for (int i = 0; i < 3; i++) {
            int idx = s.charAt(i) - 'a';
            if (freq[idx] == 0) distinct++;
            freq[idx]++;
        }

        if (distinct == 3) ans++;

        // Slide window
        for (int i = 3; i < s.length(); i++) {

            int left = s.charAt(i - 3) - 'a';
            freq[left]--;
            if (freq[left] == 0) distinct--;

            int right = s.charAt(i) - 'a';
            if (freq[right] == 0) distinct++;
            freq[right]++;

            if (distinct == 3) ans++;
        }

        return ans;
    }
}