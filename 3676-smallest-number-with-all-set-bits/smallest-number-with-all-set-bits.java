class Solution {
    public int smallestNumber(int n) {
        int k = 1;
        while(true) {
            int num = (1 << k) - 1;
            if(num >= n) {
                return num;
            }
            k++;
        }
    }
}