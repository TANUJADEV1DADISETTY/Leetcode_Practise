class Solution {
    public boolean checkOnesSegment(String s) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                ans.add(i);
            }
        }
        if(ans.size() == 1) {
            return true;
        }
        for(int i = 0; i < ans.size()-1; i++) {
            if((ans.get(i+1) - ans.get(i)) != 1) {
                return false;
            }
        }
        return true;
    }
}