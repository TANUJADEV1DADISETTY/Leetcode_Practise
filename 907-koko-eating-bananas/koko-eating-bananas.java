class Solution {
    public static int maxNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxNum(piles);
        int min = Integer.MAX_VALUE;
        int ans = arraySum(piles);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            long totalhours = 0;

            for(int i = 0; i < piles.length; i++) {
                totalhours += (piles[i] + mid - 1) / mid;
            }
            if(totalhours <= h) {
                min = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return min;
    }
}
