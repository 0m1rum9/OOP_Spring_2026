
package lab.problems.problem2;

/**
 * Pawn
 */
public class Pawn extends Piece {

    public Pawn(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to) {
        if (to == position)
            return false;

        int verticalDiffLimit = (position.vertical == 2) ? 2 : 1;
        verticalDiffLimit *= (color == Color.BLACK ? -1 : 1);
        final int horizontalDiffLimit = 1;

        return to.vertical - position.vertical <= verticalDiffLimit
                && Math.abs(to.horizontal - position.horizontal) <= horizontalDiffLimit;

    }
}
