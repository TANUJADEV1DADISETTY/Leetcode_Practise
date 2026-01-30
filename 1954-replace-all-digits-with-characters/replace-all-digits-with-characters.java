class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                ans.append(ch);
            }
            
            else {
                int shift = ch - '0';
                char prev = ans.charAt(ans.length() - 1);
                char newChar = (char)(prev + shift);
                ans.append(newChar);
            }
        }

        return ans.toString();
    }
}
