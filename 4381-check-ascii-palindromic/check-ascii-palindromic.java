class Solution {
    public boolean isPalindromic(String s) {
        String binary = "";
        for(int i = 0; i < s.length(); i++) {
            int value = (int)s.charAt(i);
            binary += Integer.toBinaryString(value);
            while(binary.length() < 8) {
                binary = "0" + binary;
            }
        }
        int i = 0;
        int j = binary.length()-1;

        while(i < j) {
            if(binary.charAt(i) != binary.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}