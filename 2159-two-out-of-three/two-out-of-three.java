class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();
        HashSet<Integer> num3 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            num1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            num2.add(nums2[i]);
        }
        for(int i = 0; i < nums3.length; i++) {
            num3.add(nums3[i]);
        }


        int[] freq = new int[101];
        for(int x : num1) {
            freq[x]++;
        }
        for(int x : num2) {
            freq[x]++;
        }
        for(int x : num3) {
            freq[x]++;
        }


        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] >= 2) {
                res.add(i);
            }
        }
        return res;
    }
}