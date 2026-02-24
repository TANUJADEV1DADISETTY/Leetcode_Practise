class Solution {

    
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] cnt = new int[mat.length];

        for(int i = 0; i < mat.length; i++) {
            int count = 0;
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    count++;
                }
                else {
                    break;
                }
            }
            cnt[i] = count;
        }
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            int min = cnt[0];
            int index = 0;
            for(int j = 1; j < cnt.length; j++) {
                if(cnt[j] < min) {
                    min = cnt[j];
                    index = j;
                }
            }
            res[i] = index;
            cnt[index] = 100000;
        }

        return res;
    }
}