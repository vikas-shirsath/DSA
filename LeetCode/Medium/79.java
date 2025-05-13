class Solution {

    public boolean dfs(char[][] board, String word, int idx, int i, int j) {
        if (idx >= word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';

        boolean found =  dfs(board, word, idx+1, i+1, j) ||
                        dfs(board, word, idx+1, i-1, j) ||
                        dfs(board, word, idx+1, i, j+1) ||
                        dfs(board, word, idx+1, i, j-1);

        board[i][j] = temp;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {

                if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j) ) {
                    return true;
                }

            }
        }
        return false;
    }
}