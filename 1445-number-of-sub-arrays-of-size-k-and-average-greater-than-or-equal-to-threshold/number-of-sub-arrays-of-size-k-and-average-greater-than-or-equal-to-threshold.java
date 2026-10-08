class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = 0;
        int cnt = 0;
        int sum = 0;
        while(right < arr.length) {
            sum += arr[right];
            while(right - left + 1 > k) {
                sum -= arr[left];
                left++;
            }
            if(right - left + 1 == k) {
                int avg = sum / k;
                if(avg >= threshold) {
                    cnt++;
                }
            }
            right++;
        }
        return cnt++;
    }
}