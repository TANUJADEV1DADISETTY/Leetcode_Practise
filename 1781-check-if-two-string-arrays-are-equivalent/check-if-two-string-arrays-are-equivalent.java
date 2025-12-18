class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String finalWord1 = "";
        for(int i = 0; i < word1.length; i++) {
            finalWord1 = finalWord1 + word1[i];
        }
        String finalWord2 = "";
        for(int i = 0; i < word2.length; i++) {
            finalWord2 = finalWord2 + word2[i];
        }
        return finalWord1.equals(finalWord2);
    }
}