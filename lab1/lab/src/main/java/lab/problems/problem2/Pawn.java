
package lab.problems.problem2;

/**
 * Pawn
 */
public class Pawn extends Piece {
    public static final int value = 1;
    public Pawn(Position position, Color color) {
        super(position, color);
    }
    public int getValue(){
        return value;
    }
    public void move(Position to) {
        // some validation 
        this.position = to;
    }
}
