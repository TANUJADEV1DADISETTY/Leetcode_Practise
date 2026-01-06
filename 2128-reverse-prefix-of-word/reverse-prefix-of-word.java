class Solution {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        String part = word.substring(0, index + 1);
        String reversed = new StringBuilder(part).reverse().toString();
        for(int i = index+1; i < word.length(); i++) {
            reversed = reversed + word.charAt(i);
        }

        return reversed;
    }
}