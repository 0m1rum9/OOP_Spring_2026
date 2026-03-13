

package lab.problems.problem2;

/**
 * Rook
 */
public class Rook extends Piece {

    public Rook(Position position, Color color) {
        super(position, color);
    }
    @Override
    public boolean isLegalMove(Position to) {
        if(to == position)
            return false;
        return (to.horizontal == position.horizontal) || (to.vertical == position.vertical);
    }
}
