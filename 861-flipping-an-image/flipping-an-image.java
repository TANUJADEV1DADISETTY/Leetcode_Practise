class Solution {
    public static int[] arrayReverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 1) {
                    image[i][j] = 0;
                }
                else {
                    image[i][j] = 1;
                }
            }
        }
        for(int i = 0 ;i < image.length; i++) {
            arrayReverse(image[i]);
        }
        return image;
        
    }
}