class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int ival = 0;
        int dval = s.length();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                res[i] = ival;
                ival = ival + 1;
            }
            else {
                res[i] = dval;
                dval = dval - 1;
            }
        }
        if(s.charAt(s.length() - 1) == 'I') {
            res[res.length - 1] = res[res.length - 2] + 1;
        }
        else {
            res[res.length - 1] = res[res.length - 2] - 1;
        }
        return res;
    }
}