class Solution {
    public String binaryNum(int n) {
        String binary = "";
        while(n != 0) {
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }
        return binary;
    }
    public boolean hasAlternatingBits(int n) {
        String s = binaryNum(n);

        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}