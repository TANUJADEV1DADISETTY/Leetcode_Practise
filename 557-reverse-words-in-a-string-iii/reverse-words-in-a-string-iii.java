class Solution {
    public String reverse(String s) {
        String ans = "";
        for(int i = s.length() -1 ; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        String res = "";

        for(int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            res = res + rev;
            if(i < words.length - 1) {
                res = res + " ";
            }
        }
        return res;
    }
}