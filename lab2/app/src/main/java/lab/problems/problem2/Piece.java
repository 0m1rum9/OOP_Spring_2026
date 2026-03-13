
package lab.problems.problem2;

/**
 * Piece
 */
public abstract class Piece {
    protected Position position;
    protected Color color;

    public Piece(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public void move(Position to) throws InvalidMoveException {
        if (isLegalMove(to)) {
            this.position = to;
        } else {
            throw new InvalidMoveException();
        }
    }

    public abstract boolean isLegalMove(Position to);

}
