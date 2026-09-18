class Solution {
    public boolean isThree(int n) {
        boolean[] arr = new boolean[n+1];

        for(int i = 1; i <= arr.length; i++) {
            if(n % i == 0) {
                arr[i] = true;
            }
        }
        //System.out.println(Arrays.toString(arr));

        int cnt = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == true) {
                cnt++;
            }
        }

        if(cnt == 3) {
            return true;
        }
        return false;
    }
}