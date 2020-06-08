package dfs;

public class WordSearch {


    /*
    *
    * Given a 2D board and a word, find if the word exists in the grid.

        The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

        Example:

        board =
        [
          ['A','B','C','E'],
          ['S','F','C','S'],
          ['A','D','E','E']
        ]

        Given word = "ABCCED", return true.
        Given word = "SEE", return true.
        Given word = "ABCB", return false.

    *
    * */

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(word.charAt(0) == board[i][j] && wordSearch(board, i, j, 0, word)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean wordSearch(char[][]board, int i, int j, int count, String word){

        if(count == word.length()){
            return true;
        }

        if(i<0
                || i >= board.length
                || j < 0
                || j >= board[i].length
                || word.charAt(count) != board[i][j]){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean result = wordSearch(board, i + 1, j, count +1, word) ||
                wordSearch(board, i - 1, j, count +1, word) ||
                wordSearch(board, i, j + 1, count +1, word) ||
                wordSearch(board, i, j - 1, count +1, word);

        board[i][j] = temp;
        return result;
    }


}
