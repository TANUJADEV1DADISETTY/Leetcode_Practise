class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int a = arr1.length;
        int b = arr2.length;
        
        int max = Math.max(a, b);

        for(int i = 0; i < max; i++){
            int num1 = 0;
            int num2 = 0;

            if(i < a){
                num1 = Integer.parseInt(arr1[i]);
            }

            if(i < b) {
                num2 = Integer.parseInt(arr2[i]);
            }

            if(num1 < num2) {
                return -1;
            }
            else if(num1 > num2) {
                return 1;
            }
        }
        return 0;

    }
}