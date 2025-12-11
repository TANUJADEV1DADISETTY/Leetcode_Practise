class Solution {
    public int hammingWeight(int n) {
        String binary = "";

        while(n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        while(binary.length() < 4) {
            binary = '0' + binary;
        }
        int count = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}