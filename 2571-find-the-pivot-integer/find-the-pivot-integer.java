class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        for(int i = 1; i <= n; i++) {
            if(i*i == sum) {
                return i;
            }
        }
        return -1;
    }
}