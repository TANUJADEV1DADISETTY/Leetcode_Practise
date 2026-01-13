class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;

        int[] arr = new int[size];
        int index = 0;

        // flatten grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[index++] = grid[i][j];
            }
        }

        Arrays.sort(arr);

        int[] res = new int[2];

        // find repeated (brute force, simple)
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                res[0] = arr[i];
                break;
            }
        }

        // find missing
        if (arr[0] != 1) {
            res[1] = 1;
            return res;
        }

        for (int i = 0; i < size - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                res[1] = arr[i] + 1;
                return res;
            }
        }

        res[1] = size;
        return res;
    }
}
