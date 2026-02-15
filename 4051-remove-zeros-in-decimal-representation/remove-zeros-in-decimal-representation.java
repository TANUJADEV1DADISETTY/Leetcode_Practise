class Solution {
    public long removeZeros(long n) {
        String ans = "";
        String s = Long.toString(n);
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0') {
                ans += s.charAt(i);
            }
        }
        return Long.parseLong(ans);
    }
}