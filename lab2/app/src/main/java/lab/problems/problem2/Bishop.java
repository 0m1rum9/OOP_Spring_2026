
package lab.problems.problem2;

/**
 * Bishop
 */
public class Bishop extends Piece {

    public Bishop(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to) {
        if (to == position)
            return false;

        return Math.abs(position.vertical - to.vertical) == Math.abs(position.horizontal - to.horizontal);
    }
}
