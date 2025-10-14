class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if(k == 1 && n >= 2) return true;
        for(int i = 0; i < n; i++){
            int f = i;
            int s = i + k;
            if(s + k <= n){
                if(check(nums, k, f) && check(nums, k, s)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean check(List<Integer> nums, int k, int i){
        while(k > 1){
            k--;
            if(nums.get(i) >= nums.get(i + 1)){
                return false;
            }
            i++;
        }
        return true;
    }
}