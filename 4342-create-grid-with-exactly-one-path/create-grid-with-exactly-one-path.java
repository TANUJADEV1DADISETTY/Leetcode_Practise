class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid = new String[m];
        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], '#');
        }

        Arrays.fill(arr[0], '.');

        for (int i = 1; i < m; i++) {
            arr[i][n - 1] = '.';
        }

        for (int i = 0; i < m; i++) {
            grid[i] = new String(arr[i]);
        }

        return grid;
    }
}