public class Pawn extends Piece{

    public Pawn (boolean isWhite) {
        super.getColor();
    }


    @Override
    public boolean canMove (Board board, Spots start, Spots end) {
        // If moving to spot with same color piece return false
        if (end.getPiece().getColor() == this.getColor()) {
            return false;
        }
        
        // Check that white is moving up one space
        if (this.getColor() == true) {
            if (end.getY() - start.getY() != -1) {
                return false;
            }
        // Check that black is moving down one space
        else {
            if (end.getY() - start.getY() != 1) {
                return false;
            }
        }

        // Check if the piece if moving straight one space there is no piece there
        if (end.getX() == start.getX()) {
            if(board.) {

            }
        }

    }
}
