class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        int temp = 1;
        while(temp <= n) {
            if(temp % 3 == 0 && temp % 5 == 0) {
                arr.add("FizzBuzz");
            }
            else if(temp % 3 == 0) {
                arr.add("Fizz");
            }
            else if(temp % 5 == 0) {
                arr.add("Buzz");
            }
            else {
                arr.add(String.valueOf(temp));
            }
            temp++;
        }
        return arr;
    }
}