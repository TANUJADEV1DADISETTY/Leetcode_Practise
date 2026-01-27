class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] heights2 = new int[heights.length];

        for(int i = 0; i < heights.length; i++) {
            heights2[i] = heights[i];
        }

        Arrays.sort(heights2);
        int idx = 0;
        String[] res = new String[names.length];
        int index = heights2.length - 1;
        for(int i = heights2.length - 1; i >= 0; i--) {
            int ans = 0;
            for(int j = 0; j < heights.length; j++) {
                if(heights2[i] == heights[j]) {
                    ans = j;
                }
            }
            res[idx++] = names[ans]; 
        }
        return res;

    }
}