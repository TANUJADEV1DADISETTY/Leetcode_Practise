class Solution {
    public int numSpecial(int[][] mat) {

        int[] rows = new int[mat.length];
        int[] cols = new int[mat[0].length];

        for(int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    cnt++;
                }
            }
            rows[i] = cnt;
        }

        int idx = 0;
        for(int i = 0; i < mat[0].length; i++) {
            int cnt = 0;
            for(int j = 0; j < mat.length; j++) {
                if(mat[j][i] == 1) {
                    cnt++;
                }
            }
            cols[idx++] = cnt;
        }

        System.out.print(Arrays.toString(rows));
        System.out.print(Arrays.toString(cols));
        int cnt = 0;

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    if(rows[i] == 1 && cols[j] == 1) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}