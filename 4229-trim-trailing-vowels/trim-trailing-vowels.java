class Solution {

    public int lastVowelIndex(String s) {
         int idx = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                idx = i;
            }
            else {
                return idx;
            }
        }
        return -1;

    }
    public String trimTrailingVowels(String s) {
        String ans = "";
        int index = lastVowelIndex(s);
        if(s.charAt(s.length() - 1) != 'a' && s.charAt(s.length() - 1) != 'e' && s.charAt(s.length() - 1) != 'i' && s.charAt(s.length() - 1) != 'o' && s.charAt(s.length() - 1) != 'u') {
            return s;
        }
        for(int i = 0; i < index; i++) {
            ans = ans + s.charAt(i);
        }

        return ans;
    }
}