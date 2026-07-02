class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                st.push(s.charAt(i));
            }
            if(st.size() != 0 && s.charAt(i) == '#') {
                st.pop();
            }
        }

        Stack<Character> st1 = new Stack<>();

        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) >= 'a' && t.charAt(i) <= 'z') {
                st1.push(t.charAt(i));
            }
            if(st1.size() != 0 && t.charAt(i) == '#') {
                st1.pop();
            }
        }

        String res = "";
        String ans = "";

        for(int i = 0; i < st.size(); i++) {
            res += st.get(i);
        }

        for(int i = 0; i < st1.size(); i++) {
            ans += st1.get(i);
        }

        if(res.equals(ans)) {
            return true;
        }
        return false;
    }
}