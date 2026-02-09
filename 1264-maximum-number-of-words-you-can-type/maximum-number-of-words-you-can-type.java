class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            String s = words[i];
            int cnt = 0;
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < brokenLetters.length(); k++) {
                    if(s.charAt(j) != brokenLetters.charAt(k)) {
                        cnt++;
                    }
                }
            }

            if(cnt == s.length()*brokenLetters.length()) {
                count++;
            }
        }
        return count;
    }
}