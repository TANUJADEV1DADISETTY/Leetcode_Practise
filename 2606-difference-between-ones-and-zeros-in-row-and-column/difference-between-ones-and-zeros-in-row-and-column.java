class Solution {

    public int[][] onesMinusZeros(int[][] grid) {
        int[] onesRow = new int[grid.length];
        int[] onesCol = new int[grid[0].length];
        int[] zerosRow = new int[grid.length];
        int[] zerosCol = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            int cnt = 0;
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    cnt++;
                }
            }
            onesRow[i] = cnt;
        }

        int idx = 0;
        for(int i = 0; i < grid[0].length; i++) {
            int cnt = 0;
            for(int j = 0; j < grid.length; j++) {
                if(grid[j][i] == 1) {
                    cnt++;
                }
            }
            onesCol[idx++] = cnt;
        }

        for(int i = 0; i < grid.length; i++) {
            int cnt = 0;
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) {
                    cnt++;
                }
            }
            zerosRow[i] = cnt;
        }

        int indx = 0;
        for(int i = 0; i < grid[0].length; i++) {
            int cnt = 0;
            for(int j = 0; j < grid.length; j++) {
                if(grid[j][i] == 0) {
                    cnt++;
                }
            }
            zerosCol[indx++] = cnt;
        }


        int[][] ans = new int[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                ans[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }

        return ans;
    }
}