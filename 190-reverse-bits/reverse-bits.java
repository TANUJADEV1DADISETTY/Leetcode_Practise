class Solution {
    public String binaryNum(int n) {
        String ans = "";
        while(n != 0) {
            int rem = n % 2;
            ans = ans + rem;
            n /= 2;
        }
        while(ans.length() <= 31) {
            ans += "0";
        }
        return ans;
    }
    public int reverseBits(int n) {

        int ans = Integer.parseInt(binaryNum(n), 2);
        return ans;
    }
}