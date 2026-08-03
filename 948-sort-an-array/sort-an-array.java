class Solution {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            }
            else {
                temp[k++] = arr[right++];
            }
        }
        while(left <= mid) {
            temp[k++] = arr[left++];
        }
        while(right <= high) {
            temp[k++] = arr[right++];
        }

        for(int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void MergeSort(int[] nums, int low, int high) {
        if(low < high) {
            int mid = low + (high - low) / 2;

            MergeSort(nums, low, mid);

            MergeSort(nums, mid + 1, high);

            merge(nums, low, mid, high);
        }
    }
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}