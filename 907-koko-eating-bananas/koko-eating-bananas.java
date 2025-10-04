class Solution {
    public static boolean eatBananas(int[] piles, int h, int k) {
        int hrs = 0;
        for (int i = 0; i < piles.length; i++) {
            hrs += (piles[i] + k - 1) / k;  
        }
        return hrs <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // find max pile
        for (int p : piles) {
            if (p > right) right = p;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (eatBananas(piles, h, mid)) {
                right = mid; // try smaller speed
            } else {
                left = mid + 1; // need more speed
            }
        }

        return left; // min speed where she can finish in h hours
    }
}
