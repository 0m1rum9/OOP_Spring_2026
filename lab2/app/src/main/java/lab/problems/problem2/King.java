
package lab.problems.problem2;

/**
 * King
 */
public class King extends Piece {

    public King(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to) {
        if (to == position)
            return false;

        final int verticalDiffLimit = 1;
        final int horizontalDiffLimit = 1;

        return Math.abs(to.horizontal - position.horizontal) <= horizontalDiffLimit
                && Math.abs(to.vertical - position.vertical) <= verticalDiffLimit;
    }

}
