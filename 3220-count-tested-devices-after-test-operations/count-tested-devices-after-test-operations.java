class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int dev = 0;
        for(int i = 0; i < batteryPercentages.length; i++) {
            if(batteryPercentages[i] > 0) {
                dev++;
                for(int j = i + 1; j < batteryPercentages.length; j++) {
                    if(batteryPercentages[j] > 0) {
                        batteryPercentages[j] -= 1;
                    }
                }
            }
        }
        return dev;
    }
}