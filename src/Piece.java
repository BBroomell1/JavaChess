// Represents a piece on the board. Will be extended to show which type of piece.

public abstract class Piece {
    // Every piece will either be white or not
    private boolean white = true;
    // Holds the status of the piece being on the board (alive) or off the board (dead)
    private boolean alive = true;

    // Returns if the piece if white or not
    public boolean getColor () {
        return this.white;
    }

    // Sets if the piece if white or not
    public void setColor (boolean isWhite) {
        this.white = isWhite;
    }

    // Returns if the piece is alive or not
    public boolean isAlive () {
        return this.alive;
    }

    // Sets the status of the piece being dead or alive
    public void setAlive (boolean alive) {
        this.alive = alive;
    }

    public abstract boolean legalMove (Board board, Spots start, Spots end);

}
