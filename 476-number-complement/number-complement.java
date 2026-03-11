class Solution {
    public int findComplement(int n) {
        String binary = "";
        while(n != 0){
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }

        String binary1 = "";
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                binary1 += '0';
            }
            else {
                binary1 += '1';
            }
        }

        int dec = 0;
        for(int i = 0; i < binary1.length(); i++) {
            int digit = binary1.charAt(i) - '0';
            dec = dec * 2 + digit;
        }
        return dec;
    }
}