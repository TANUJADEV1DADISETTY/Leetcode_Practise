class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int rev = ('z' - ch) + 1;
            int pro = rev * (i+1);
            sum += pro;
        }
        return sum;
    }
}