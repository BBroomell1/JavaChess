
// Holds the 8 X 8 array of spots
public class Board {
    Spots[][] board = new Spots[8][8];

    public Board () {
        this.resetBoard();
    }

    public void resetBoard () {
        // Place white pieces first row
        board[0][0] = new Spots(0, 0, new Rook(true));
        board[1][0] = new Spots(0, 0, new Knight(true));
        board[2][0] = new Spots(0, 0, new Bishop(true));
        board[3][0] = new Spots(0, 0, new Queen(true));
        board[4][0] = new Spots(0, 0, new King(true));
        board[5][0] = new Spots(0, 0, new Bishop(true));
        board[6][0] = new Spots(0, 0, new Knight(true));
        board[7][0] = new Spots(0, 0, new Rook(true));

        // Place white pieces second row
        board[0][1] = new Spots(0, 1, new Pawn(true));
        board[1][1] = new Spots(1, 1, new Pawn(true));
        board[2][1] = new Spots(2, 1, new Pawn(true));
        board[3][1] = new Spots(3, 1, new Pawn(true));
        board[4][1] = new Spots(4, 1, new Pawn(true));
        board[5][1] = new Spots(5, 1, new Pawn(true));
        board[6][1] = new Spots(6, 1, new Pawn(true));
        board[7][1] = new Spots(7, 1, new Pawn(true));

        // Place black pieces first row
        board[0][7] = new Spots(0, 7, new Rook(false));
        board[1][7] = new Spots(0, 7, new Knight(false));
        board[2][7] = new Spots(0, 7, new Bishop(false));
        board[3][7] = new Spots(0, 7, new King(false));
        board[4][7] = new Spots(0, 7, new Queen(false));
        board[5][7] = new Spots(0, 7, new Bishop(false));
        board[6][7] = new Spots(0, 7, new Knight(false));
        board[7][7] = new Spots(0, 7, new Rook(false));

        // Place black pieces second row
        board[0][6] = new Spots(0, 6, new Pawn(false));
        board[1][6] = new Spots(1, 6, new Pawn(false));
        board[2][6] = new Spots(2, 6, new Pawn(false));
        board[3][6] = new Spots(3, 6, new Pawn(false));
        board[4][6] = new Spots(4, 6, new Pawn(false));
        board[5][6] = new Spots(5, 6, new Pawn(false));
        board[6][6] = new Spots(6, 6, new Pawn(false));
        board[7][6] = new Spots(7, 6, new Pawn(false));

        for (int row = 2; row < 7; row++) {
            for (int column = 0; column < 8; column++) {
                board[column][row] = new Spots(column, row, null);
            }
        }

    }

}
