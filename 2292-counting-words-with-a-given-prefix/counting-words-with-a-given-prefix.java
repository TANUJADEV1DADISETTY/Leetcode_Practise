class Solution {
    public int prefixCount(String[] words, String pref) {
        int size = pref.length();
        int maxcnt = 0;
        for(int i = 0; i < words.length; i++) {
            String each = words[i];
            int cnt = 0;

            if(each.length() < size) {
                continue;
            }
            for(int j = 0; j < size; j++) {
                if(each.charAt(j) == pref.charAt(j)) {
                    cnt++;
                }
                else {
                    break;
                }
            }
            if(cnt == size) {
                maxcnt++;
            }
        }
        return maxcnt;
    }
}