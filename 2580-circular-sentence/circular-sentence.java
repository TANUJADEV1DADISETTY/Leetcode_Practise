class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] words = sentence.split(" ");

        if(words.length == 1) {
            String ss = words[0];
            if(ss.charAt(0) == ss.charAt(ss.length() - 1)) {
                return true;
            }
            else {
                return false;
            }
        }
        for(int i = 0; i < words.length - 1; i++) {
            String s = words[i];
            String str = words[i+1];

            if(s.charAt(s.length() - 1) != str.charAt(0)) {
                return false;
            }

        }

        String a = words[0];
        String b = words[words.length - 1];

        if(a.charAt(0) != b.charAt(b.length() - 1)) {
            return false;
        }
        

        return true;
    }
}