class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        //Stack<Character> st = new Stack<>();
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '(' && s.charAt(i) != ')') {
                res += s.charAt(i);
            }
            if(s.charAt(i) == '(') {
                String sub = "";
                for(int j = i+1; j < s.length(); j++) {
                    if(s.charAt(j) != ')') {
                        sub += s.charAt(j);
                    }
                    else {
                        break;
                    }
                    i = j;
                }
                if(map.containsKey(sub)) {
                    res += map.get(sub);
                }
                else {
                    res += "?";
                }
            }
            // if(i > 0 && s.charAt(i-1) == ')') {
            //     for(int k = i; k < s.length(); k++) {
            //         if(s.charAt(k) != '(') {
            //             res += s.charAt(k);
            //         }
            //         else {
            //             break;
            //         }
            //     }
            // }

        }
        return res;
    }
}