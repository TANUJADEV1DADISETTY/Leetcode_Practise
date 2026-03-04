class Solution {
    public static boolean isSelf(int num) {
        int temp = num;

        if(num == 0) {
            return false;
        }
        while(num > 0) {
            int rem = num % 10;
            if(rem == 0) {
                return false;
            }

            if(temp % rem != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfNumbers = new ArrayList<>();

        for(int i = left; i<= right; i++) {
            if(isSelf(i)) {
                selfNumbers.add(i);
            }
        }
        return selfNumbers;
    }
}