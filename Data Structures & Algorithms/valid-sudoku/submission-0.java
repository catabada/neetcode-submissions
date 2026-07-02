class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> mapRow = new HashMap<>();
        HashMap<Integer, HashSet<Character>> mapColumn = new HashMap<>();
        HashMap<Integer, HashSet<Character>> mapSquare = new HashMap<>();
        final int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            mapRow.put(i, new HashSet<>());
            mapColumn.put(i, new HashSet<>());
            mapSquare.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;
                if (mapRow.get(i).contains(board[i][j]))
                    return false;
                else mapRow.get(i).add(board[i][j]);

                if (mapColumn.get(j).contains(board[i][j]))
                    return false;
                else mapColumn.get(j).add(board[i][j]);

                final int index = (i / 3) * (n / 3) + (j / 3);
                if (mapSquare.get(index).contains(board[i][j]))
                    return false;
                else mapSquare.get(index).add(board[i][j]);
            }
        }
        return true;
    }
}
