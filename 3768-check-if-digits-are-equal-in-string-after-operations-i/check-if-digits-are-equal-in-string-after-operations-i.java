class Solution {
     public static boolean sameStr(String s) {
        if(s.charAt(0) == s.charAt(1)) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean hasSameDigits(String s) {
        int sum = 0;
        String res = "";
        for(int i = 0; i < s.length() - 1; i++) {
            sum = ((s.charAt(i) - '0') + (s.charAt(i+1) - '0'))%10;
            res += sum;
        }
        if(res.length() == 2) {
            return sameStr(res);
        }
       return hasSameDigits(res);
    }
}