class Solution {
    public int minSteps(String s, String t) {
        int[] sfreq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sfreq[ch - 'a']++;
        }

        int[] tfreq = new int[26];

        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tfreq[ch - 'a']++;
        }

        System.out.print(Arrays.toString(sfreq));
        System.out.print(Arrays.toString(tfreq));

        int cnt = 0;
        for(int i = 0; i < 26; i++) {
            if(tfreq[i] > sfreq[i]) {
                cnt += (tfreq[i] - sfreq[i]);
            }
        }
        return cnt;
    }
}