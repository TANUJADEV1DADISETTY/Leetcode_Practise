class Solution {
    public boolean isPalindrome(String s) {
        String sentence = "";
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i)>='a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sentence = sentence + s.charAt(i);
            }
        }
        
        sentence = sentence.toLowerCase();
        int i = 0;
        int j = sentence.length() - 1;
        while(i <= j) {
            if(sentence.charAt(i) != sentence.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}