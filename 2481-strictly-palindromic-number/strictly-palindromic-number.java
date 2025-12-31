class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n - 2; i++) {
            int temp = n;
            String binary = "";
            while(temp > 0) {
                binary = (temp % i) + binary;
                temp = temp / i;
            }
            if(!isPalindrome(binary)) {
                return false;
            }
        }
        return true;
    }
}