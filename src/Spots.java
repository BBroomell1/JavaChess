

// Each space on the board
// Each spot can contain a chess piece

public class Spots {
    // Variables each spot will contain
    private Piece piece;
    private int x;
    private int y;

    // Returns if there is a piece at this spot
    public Piece getPiece() {
        return this.piece;
    }

    // Places a piece on this spot
    public void setPiece(Piece P) {
        this.piece = P;
    }

    // Returns the x position of this spot
    public int getX() {
        return this.x;
    }

    // Sets the X position of this spot
    public void setX (int X) {
        this.x = X;
    }

    // Returns the y position of this spot
    public int getY () {
        return this.y;
    }

    // Sets the y position of this spot
    public void setY (int Y) {
        this.y = Y;
    }


}
