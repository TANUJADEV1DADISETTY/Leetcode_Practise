class Solution {
    public boolean halvesAreAlike(String s) {
        String one = "";
        String two = "";
        for(int i = 0; i < s.length()/2; i++) {
            one += s.charAt(i);
        }
        for(int i = s.length()/2; i < s.length(); i++) {
            two += s.charAt(i);
        }
        int oneCt = 0;;
        for(int i = 0; i < one.length(); i++) {
            if(one.charAt(i) == 'a' || one.charAt(i) == 'e' || one.charAt(i) == 'i' || one.charAt(i) == 'o' || one.charAt(i) == 'u' || one.charAt(i) == 'A' || one.charAt(i) == 'E' || one.charAt(i) == 'I' || one.charAt(i) == 'O' || one.charAt(i) == 'U') {
                oneCt++;
            }
        }
        int twoCt = 0;
        for(int i = 0; i < two.length(); i++) {
            if(two.charAt(i) == 'a' || two.charAt(i) == 'e' || two.charAt(i) == 'i' || two.charAt(i) == 'o' || two.charAt(i) == 'u' || two.charAt(i) == 'A' || two.charAt(i) == 'E' || two.charAt(i) == 'I' || two.charAt(i) == 'O' || two.charAt(i) == 'U') {
                twoCt++;
            }
        }
        return oneCt == twoCt;
    }
}