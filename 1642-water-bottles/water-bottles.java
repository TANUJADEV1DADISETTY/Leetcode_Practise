class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = numBottles;

        while(empty >= numExchange) {
            int newBottels = empty / numExchange;
            ans += newBottels;
            empty = empty % numExchange + newBottels;
        }
        return ans;
    }
}