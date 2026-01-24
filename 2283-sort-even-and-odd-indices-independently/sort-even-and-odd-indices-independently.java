class Solution {
    public int[] sortEvenOdd(int[] nums) {

        int evencnt = 0;
        int oddcnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                evencnt++;
            }
            else {
                oddcnt++;
            }
        }
        int[] even = new int[evencnt];
        int[] odd = new int[oddcnt];
        int index = 0;
        int ind = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                even[index++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 1) {
                odd[ind++] = nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);


        int[] ans = new int[nums.length];
        int e = 0;
        int o = odd.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                ans[i] = even[e++];
            }
            else {
                ans[i] = odd[o--];
            }
        }
        return ans;
    }
}