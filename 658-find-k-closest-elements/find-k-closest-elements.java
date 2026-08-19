class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;
        while(j-i+1 > k) {
            if(Math.abs(arr[i] - x) > Math.abs(arr[j] - x)) {
                i++;
            }
            else {
                j--;
            }
        }
        for(int s = i; s <= j; s++) {
            res.add(arr[s]);
        }
        return res;
    }
}