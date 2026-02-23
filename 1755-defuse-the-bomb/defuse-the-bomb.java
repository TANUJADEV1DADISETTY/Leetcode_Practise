class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] code1 = new int[2 * code.length];
        int i = 0;
        int idx = 0;
        while(i < code1.length) {
            if(i >= code.length) {
                code1[i] = code[i - code.length];
            }
            else {
                code1[i] = code[idx];
            }
            i++;
            idx++;
        }
        System.out.print(Arrays.toString(code1));
        int[] res = new int[code.length];


        if(k == 0) {
            return res;
        }

        if(k > 0) {
            for(int l = 0; l < code.length; l++) {
                int sum = 0;
                for(int j = l+1; j < l+1+k; j++) {
                    sum += code1[j];
                }
                res[l] = sum;
            }
        }
        int n = code.length;
        if(k < 0) {
            int s = k*-1;
            for(int m = n - 1; m >= 0; m--) {
                int sum = 0;
                for(int j = (m+n)-1; j >= (m+n)-s; j--) {
                    sum += code1[j];
                }
                res[m] = sum;
            }

        }
        return res;
    }
}