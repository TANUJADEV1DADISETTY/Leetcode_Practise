class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int maxcnt = piles.length / 3;
        int cnt = 0;
        int i = piles.length - 1;
        int j = 0;
        int sum = 0;
        while(j <= i) {
            int a = piles[i];
            int b = piles[i-1];
            int c = piles[j];
            cnt++;
            sum += b;
            i -= 2;
            j++;
            if(cnt == maxcnt) {
                break;
            }
        }
        return sum;
    }
}