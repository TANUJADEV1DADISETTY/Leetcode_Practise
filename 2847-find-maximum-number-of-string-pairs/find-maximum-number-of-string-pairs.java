class Solution {

    public String reverseString(String s) {
        String ans = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int cnt = 0;
        for(int i = 0; i < words.length; i++) {
            String s = words[i];
            for(int j = i+1; j < words.length; j++) {
                String str = words[j];
                if( i != j && s.equals(reverseString(str))) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}