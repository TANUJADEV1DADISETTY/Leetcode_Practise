class Solution {
    public String reversePrefix(String s, int k) {
        String newStr = s.substring(0, k);
        String reversed = new StringBuilder(newStr).reverse().toString();
        for(int i = k; i < s.length(); i++) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}