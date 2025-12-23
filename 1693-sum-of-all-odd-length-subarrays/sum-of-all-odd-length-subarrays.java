class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                 ArrayList<Integer> res = new ArrayList<>();
                for(int k = i; k <=j; k++) {
                    res.add(arr[k]);
                    sum = sum + arr[k];
                }
                if(res.size() % 2 == 1) {
                    totalSum = totalSum + sum;
                }
                else {
                    totalSum = totalSum + 0;
                }
                sum = 0;
            }
        }
        return totalSum;
    }
}