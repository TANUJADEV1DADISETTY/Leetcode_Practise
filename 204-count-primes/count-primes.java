class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(arr[i] == false) {
                for(int j = i*i; j <= n; j+=i) {
                    //if(j % i == 0) {
                        arr[j] = true;
                    //}
                }
            }
        }
        int cnt = 0;
        for(int i = 2; i < n; i++) {
            if(arr[i] == false) {
                cnt++;
            }
        }
        return cnt;
    }
}