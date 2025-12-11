class Solution {
    public String binaryNum(int n) {
        String binary = "";
        while(n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        while(binary.length() < 4) {
            binary = '0' + binary;
        }
        return binary;
    }
    public int hammingDistance(int x, int y) {
        int cnt = 0;
        String binaryX = binaryNum(x);
        String binaryY = binaryNum(y);
        int maxLen = Math.max(binaryX.length(), binaryY.length());
        while(binaryX.length() < maxLen) {
            binaryX = '0' + binaryX;
        }
        while(binaryY.length() < maxLen) {
            binaryY = '0' + binaryY;
        }
        for(int i = 0; i < maxLen; i++) {
            if(binaryX.charAt(i) != binaryY.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}