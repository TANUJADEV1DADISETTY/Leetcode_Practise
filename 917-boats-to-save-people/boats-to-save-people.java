class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int boats = 0;
        while(i <= j) {
            int sum = people[i] + people[j];
            if(sum > limit) {
                boats++;
                j--;
            }
            else {
                boats++;
                i++;
                j--;
            }
        }
        return boats;
    }
}