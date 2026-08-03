class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);

        String first = strs[0];
        String second = strs[strs.length - 1];

        int min = Math.min(first.length(), second.length());

        for(int i = 0; i < min; i++) {
            if(first.charAt(i) == second.charAt(i)) {
                res += first.charAt(i);
            }
            else {
                break;
            }
        }
        return res;
    }
}