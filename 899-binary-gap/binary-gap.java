class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);

       int dis = 0;
       int prev = -1;

       int i = 0;
       while(i < binary.length()){
            if(binary.charAt(i) == '1') {
                if(prev != -1) {
                    dis = Math.max(dis, i - prev);
                }
                prev = i;
            }
            i++;
       }
       return dis;
    }
}