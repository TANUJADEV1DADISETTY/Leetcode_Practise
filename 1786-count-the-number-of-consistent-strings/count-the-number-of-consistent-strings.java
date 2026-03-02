class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        for(String word : words) {
            boolean isValid = true;
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(allowed.indexOf(ch) == -1) {
                    isValid = false;
                    break;
                }
            }

            if(isValid) {
                cnt++;
            }
        }
        return cnt;
    }
}