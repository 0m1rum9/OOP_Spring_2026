
package lab.problems.problem2;

/**
 * Queen
 */
public class Queen extends Piece {

    public Queen(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position to) {
        Bishop bishop = new Bishop(position, color);
        Rook rook = new Rook(position, color);

        return bishop.isLegalMove(to) || rook.isLegalMove(to);
    }
}
