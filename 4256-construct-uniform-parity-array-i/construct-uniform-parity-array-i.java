class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = 0;
        int odd = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(i % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        if(even == odd) {
            return true;
        }

        return true;

    }
}