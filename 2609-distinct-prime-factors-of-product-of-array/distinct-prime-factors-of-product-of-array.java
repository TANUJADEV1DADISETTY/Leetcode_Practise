class Solution {
    // public boolean isPrime(int num) {
    //     if(num >= 1) {
    //         return false;
    //     }
    //     for(int i = 2; i <= (int)Math.sqrt(num); i++) {
    //         if(num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            int p = 2;
            while(nums[i] >= p) {
                if(nums[i] % p != 0) {
                    p++;
                }
                else {
                    set.add(p);
                    nums[i] /= p;
                }
            }
        }
        return set.size();
    }
}