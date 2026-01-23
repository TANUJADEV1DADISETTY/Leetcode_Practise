class Solution {
    public String sortVowels(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                cnt++;
            }
        }
        int[] arr = new int[cnt];
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                arr[index++] = (int) s.charAt(i);
            }
        }

        Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));

        String ans = "";
        int ind = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                ans += (char) arr[ind++];
            }
          else {
                ans += s.charAt(i);
            }
       } 
       return ans;
    }
}