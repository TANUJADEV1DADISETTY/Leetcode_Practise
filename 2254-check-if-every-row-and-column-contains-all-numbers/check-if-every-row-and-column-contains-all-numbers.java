class Solution {
    public boolean checkValid(int[][] matrix) {
        // int[] freq = new int[matrix.length+1];

        for(int i = 0; i < matrix.length; i++) {
            int[] freq = new int[matrix.length+1];
            for(int j = 0; j < matrix.length; j++) {
                freq[matrix[i][j]]++;
            }
            for(int k = 1; k < freq.length; k++) {
                if(freq[k] != 1) {
                    return false;
                }
            }
        }

        for(int j = 0; j < matrix.length; j++) {
            int[] freq = new int[matrix.length+1];
            for(int i = 0; i < matrix.length; i++) {
                freq[matrix[i][j]]++;
            }
            for(int k = 1; k < freq.length; k++) {
                if(freq[k] != 1) {
                    return false;
                }
            }
        }

        return true;
    }
}