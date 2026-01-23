class Solution {
    public String kthDistinct(String[] arr, int k) {
        String[] ans = new String[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    cnt++;
                }
            }
            if(cnt == 1) {
                ans[index++] = arr[i];
            }
        }
        System.out.print(Arrays.toString(ans));
        String res = "";

        // for(int i = 0; i < ans.length; i++) {
            if(ans[k - 1] == null) {
                res = "";
            }
            else {
                res += ans[k-1];
            }
        // }
        return res;
    }
}