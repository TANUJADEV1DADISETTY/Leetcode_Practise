class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < nums1.length - 1; i++) {
            if(nums1[i] != nums1[i + 1]) {
                arr1.add(nums1[i]);
            }
        }
        arr1.add(nums1[nums1.length - 1]);

        
        for(int i = 0; i < nums2.length - 1; i++) {
            if(nums2[i] != nums2[i + 1]) {
                arr2.add(nums2[i]);
            }
        }
        arr2.add(nums2[nums2.length - 1]);

        ArrayList<Integer> newArray = new ArrayList<>();

        for(int i = 0; i < arr1.size(); i++) {
            for(int j = 0; j < arr2.size(); j++) {
                if(arr1.get(i).equals(arr2.get(j))) {
                    newArray.add(arr2.get(j));
                }
            }
        }

        int[] res = new int[newArray.size()];
        for(int i = 0; i < newArray.size(); i++) {
            res[i] = newArray.get(i);
        }

        return res;
    }
}