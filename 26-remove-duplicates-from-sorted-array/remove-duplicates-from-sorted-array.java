class Solution {
    public int removeDuplicates(int[] arr) {
        int i = 0;
        int j = 0;
        while(j < arr.length) {
            if(arr[i] == arr[j]) {
                j++;
            }
            else {
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
                j++;
            }
        }
        return i + 1;
    }
}