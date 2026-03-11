class Solution {
    public int bitwiseComplement(int n) {

        if(n == 0) {
            return 1;
        }
        String binary = "";
        while(n != 0) {
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }
        System.out.println(binary);
        String newbinary = "";
        for(int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if(ch == '0') {
                newbinary += '1';
            }
            else {
                newbinary += '0';
            }
            System.out.println(ch);
        }

        System.out.println(newbinary);

        int ans = 0;

        for(int i = 0; i < newbinary.length(); i++) {
            int digit = newbinary.charAt(i) - '0';
            ans = ans * 2 + digit;
        }

        return ans;
    }
}