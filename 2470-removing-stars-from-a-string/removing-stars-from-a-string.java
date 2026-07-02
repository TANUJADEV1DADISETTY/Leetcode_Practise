class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                st.push(s.charAt(i));
            }
            if(st.size() != 0 && s.charAt(i) == '*') {
                st.pop();
            }
        }
        String res = "";
        for(int i = 0; i < st.size(); i++) {
            res += st.get(i);
        }
        return res;
    }
}