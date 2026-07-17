class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int container = n * n;
        while(container > 0) {
            if(container * w <= maxWeight) {
                return container;
            }
            container--;
        }
        return 0;
    }
}