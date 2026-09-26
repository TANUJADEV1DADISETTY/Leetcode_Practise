class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        while(right < s.length()) {
            while(right - left + 1 > k) {
                if(map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                }
                left++;
            }
            if(s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u') {
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            }
            int currsum = 0;
            for(int value : map.values()) {
                    currsum += value;
            }
            max = Math.max(max, currsum);
            right++;
        }
        return max;
    }
}