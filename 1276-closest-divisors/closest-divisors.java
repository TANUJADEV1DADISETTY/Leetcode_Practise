class Solution {
    public int[] closestDivisors(int num) {
        int[] num1 = new int[2];
        int[] num2 = new int[2];

        for(int i = 1; i <= (int)Math.sqrt(num+1); i++) {
            if((num+1) % i == 0) {
                num1[0] = i;
                num1[1] = (num+1) / i;
            }
        }
        for(int i = 1; i <= (int)Math.sqrt(num+2); i++) {
            if((num+2) % i == 0) {
                num2[0] = i;
                num2[1] = (num+2) / i;
            }
        }

        int res1 = Math.abs(num1[0] - num1[1]);
        int res2 = Math.abs(num2[0] - num2[1]);

        if(res1 <= res2) {
            return num1;
        }
        return num2;
    }
}