class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int r = 0; r < 9; r++) {
            HashSet<Character> set = new HashSet<>();
            for(int c = 0; c < 9; c++) {
                if(board[r][c] >= '1' && board[r][c] <= '9') {
                    if(set.contains(board[r][c])) {
                        return false;
                    }
                    set.add(board[r][c]);
                }
            }
        }
        for(int r = 0; r < 9; r++) {
            HashSet<Character> set = new HashSet<>();
            for(int c = 0; c < 9; c++) {
                if(board[c][r] >= '1' && board[c][r] <= '9') {
                    if(set.contains(board[c][r])) {
                        return false;
                    }
                    set.add(board[c][r]);
                }
            }
        }
        for(int r = 0; r < 9; r+=3) {
            for(int c = 0; c < 9; c += 3) {
                HashSet<Character> set = new HashSet<>();

                for(int r1 = r; r1 < r+3; r1++) {
                    for(int c1 = c; c1 < c+3; c1++) {
                        if(board[r1][c1] >= '1' && board[r1][c1] <= '9') {
                            if(set.contains(board[r1][c1])) {
                                return false;
                            }
                            set.add(board[r1][c1]);
                        }
                    }
                }
            }
        }
        return true;
    }
}