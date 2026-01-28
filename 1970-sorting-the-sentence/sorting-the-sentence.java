class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            // System.out.print(word + " ");
            // System.out.print(word.length());
            char index = word.charAt(word.length() - 1);
            // System.out.print(index);
            int idx = index - '0';
            res[idx - 1] = word.substring(0, word.length() - 1);
            
        }
        String ans = String.join(" ", res);
        return ans;
    }
}