class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int ans = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                ans = freq[i];
                break;
            }
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0 && freq[i] != ans) {
                return false;
            }
        }
        return true;
    }
}