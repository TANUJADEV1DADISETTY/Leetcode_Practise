class Solution {
    public String mergeAlternately(String word1, String word2) {
        String newWord = "";
        int i = 0;
        while(i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                newWord += word1.charAt(i);
            }
            if(i < word2.length()) {
                newWord += word2.charAt(i);
            }
            i++;
        }
        return newWord;
    }
}