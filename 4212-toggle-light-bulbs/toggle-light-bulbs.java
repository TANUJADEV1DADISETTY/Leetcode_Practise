class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> arr = new ArrayList<>();

       int[] freq = new int[101];

       for(int i = 0; i < bulbs.size(); i++) {
            freq[bulbs.get(i)]++;
       }

       for(int i = 0; i < freq.length; i++) {
            if(freq[i] % 2 != 0) {
                arr.add(i);
            }
       }
        return arr;
    }
}