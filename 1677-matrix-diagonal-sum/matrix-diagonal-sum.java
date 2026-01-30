class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i] + mat[i][n-i-1];
        }
        if(mat.length % 2 != 0) {
            int low = 0;
            int high = mat.length;
            int mid = (low+high)/2;

            sum = sum - mat[mid][mid];
        }
        
        return sum;
    }
}